package shop.mtcoding.miniproject.controller;

import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.miniproject.dto.person.PersonReq.JoinPersonReqDto;
import shop.mtcoding.miniproject.dto.person.PersonReq.LoginPersonReqDto;
import shop.mtcoding.miniproject.model.PersonRepository;
import shop.mtcoding.miniproject.service.PersonService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.miniproject.dto.post.PostReq.PostSaveReqDto;
import shop.mtcoding.miniproject.dto.post.PostResp.PostTitleRespDto;
import shop.mtcoding.miniproject.handler.ex.CustomException;
import shop.mtcoding.miniproject.model.Company;
import shop.mtcoding.miniproject.model.CompanyRepository;
import shop.mtcoding.miniproject.model.Post;
import shop.mtcoding.miniproject.model.PostRespository;
import shop.mtcoding.miniproject.model.Skill;
import shop.mtcoding.miniproject.model.SkillRepository;
import shop.mtcoding.miniproject.model.User;
import shop.mtcoding.miniproject.service.PostService;
import shop.mtcoding.miniproject.util.Script;

@Controller
public class CompanyContoller {

    @Autowired
    private HttpSession session;
    @Autowired
    private PostRespository postRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private PostService postService;

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;

    public void companyMocLogin() {
        User user = new User();
        user.setId(2);
        user.setPInfoId(0);
        user.setCInfoId(1);
        user.setEmail("init@nate.com");
        user.setPassword("1234");

        session.setAttribute("principal", user);
    }

    @PostMapping("/personJoin")
    public String join(JoinPersonReqDto joinPersonReqDto) {

        System.out.println("테스트 : " + joinPersonReqDto.getName());
        System.out.println("테스트 : " + joinPersonReqDto.getPassword());

        if (joinPersonReqDto.getName() == null ||
                joinPersonReqDto.getName().isEmpty()) {
            throw new CustomException("name을 작성해주세요");
        }
        if (joinPersonReqDto.getPassword() == null ||
                joinPersonReqDto.getPassword().isEmpty()) {
            throw new CustomException("password를 작성해주세요");
        }
        if (joinPersonReqDto.getEmail() == null ||
                joinPersonReqDto.getEmail().isEmpty()) {
            throw new CustomException("email을 작성해주세요");
        }
        personService.회원가입(joinPersonReqDto);

        // Person 인서트를 이름만!
        // Person 인서트한 id 값을 유저에게 인서트하기

        return "redirect:/personJoinForm2";
    }

    @PostMapping("/personJoin2")
    public String join() {
        return "";
    }

    @PostMapping("/personLogin")
    public String personLoginForm(LoginPersonReqDto loginPersonReqDto) {

        System.out.println("테스트: " + loginPersonReqDto.getEmail());
        System.out.println("테스트: " + loginPersonReqDto.getPassword());

        if (loginPersonReqDto.getEmail() == null ||
                loginPersonReqDto.getEmail().isEmpty()) {
            throw new CustomException("email을 작성해주세요");
        }
        if (loginPersonReqDto.getPassword() == null ||
                loginPersonReqDto.getPassword().isEmpty()) {
            throw new CustomException("password를 작성해주세요");
        }

        User principal = personRepository.findByEmailAndPassword(loginPersonReqDto.getEmail(),
                loginPersonReqDto.getPassword());
        if (principal == null) {
            throw new CustomException("이메일 혹은 패스워드가 잘못입력되었습니다.");
        }

        session.setAttribute("principal", principal);

        return "redirect:/person/main";
    }

    // 인증에 필요한 일이기 때문에 company/login 이 아닌 이어서 했습니다.
    @GetMapping("/companyLoginForm")
    public String companyLoginForm() {
        return "company/loginForm";
    }

    @GetMapping("/companyJoinForm1")
    public String companyJoinForm1() {
        return "company/joinForm1";
    }

    @GetMapping("/companyJoinForm2")
    public String companyJoinForm2() {
        // jsp에서 받은 값을 여기에 들고와서 넘겨줘야함
        return "company/joinForm2";
    }

    @GetMapping({ "/company/main", "/company" })
    public String companyMain() {
        // companyMocLogin();
        return "company/main";
    }

    @GetMapping("/company/getResume")
    public String companyGetResume() {
        return "company/getResume";
    }

    @GetMapping("/company/recommend")
    public String companyRecommend() {
        return "company/recommend";
    }

    @GetMapping("/company/info")
    public String companyInfo() {
        return "company/info";
    }

    @GetMapping("/company/updateInfoForm")
    public String companyUpdateInfoForm() {
        return "company/updateInfoForm";
    }

    @GetMapping("/company/scrap")
    public String companyScrap() {
        return "company/scrap";
    }

    @GetMapping("/company/posts")
    public String companyPosts(Model model) {
        companyMocLogin();

        User userPS = (User) session.getAttribute("principal");
        if (userPS == null) {
            throw new CustomException("인증이 되지 않았습니다.", HttpStatus.FORBIDDEN);
        }

        List<PostTitleRespDto> postTitleList = postRepository.findAllTitleByCInfoId(userPS.getCInfoId());
        model.addAttribute("postTitleList", postTitleList);
        return "company/posts";
    }

    @GetMapping("/company/postDetail/{id}")
    public String personDetail(@PathVariable int id, Model model) {
        companyMocLogin();

        User userPS = (User) session.getAttribute("principal");
        if (userPS == null) {
            throw new CustomException("인증이 되지 않았습니다.", HttpStatus.FORBIDDEN);
        }

        Post postPS = (Post) postRepository.findById(id);
        if (postPS == null) {
            throw new CustomException("없는 공고 입니다.");
        }
        if (postPS.getCInfoId() != userPS.getCInfoId()) {
            throw new CustomException("게시글을 볼 권한이 없습니다.", HttpStatus.FORBIDDEN);
        }
        Company companyPS = (Company) companyRepository.findById(userPS.getCInfoId());
        Skill skillPS = (Skill) skillRepository.findByPostId(id);
        StringTokenizer skills = new StringTokenizer(skillPS.getSkills(), ",");

        // 공고 디테일 보기 //인증 및 권한체크
        model.addAttribute("post", postPS);
        model.addAttribute("company", companyPS);
        model.addAttribute("skills", skills);

        return "company/postDetail";
    }

    @GetMapping("/company/savePostForm")
    public String personSavePostForm(Model model) {
        companyMocLogin();
        User userPS = (User) session.getAttribute("principal");
        if (userPS == null) {
            throw new CustomException("인증이 되지 않았습니다.", HttpStatus.FORBIDDEN);
        }

        Company companyPS = (Company) companyRepository.findById(userPS.getCInfoId());
        // if (companyPS.getBossName() == null || companyPS.getBossName().isEmpty()
        // || companyPS.getCyear() == null || companyPS.getLogo() == null ||
        // companyPS.getLogo().isEmpty()
        // || companyPS.getManagerPhone() == null ||
        // companyPS.getManagerPhone().isEmpty()
        // || companyPS.getSize() == null || companyPS.getCyear() == null) {
        // return "redirect:/company/info";
        // }

        model.addAttribute("company", companyPS);
        model.addAttribute("skills", Skill.madeSkills());
        return "company/savePostForm";
    }

    @PostMapping("/company/savePost")
    public String personSavePost(Model model, PostSaveReqDto PostSaveReqDto) {
        companyMocLogin();
        User userPS = (User) session.getAttribute("principal");

        // postinsert skillinsert 동시 진행
        int id = postService.공고등록(PostSaveReqDto, userPS.getCInfoId());

        return "redirect:/company/postDetail/" + id; // +id
    }

}
