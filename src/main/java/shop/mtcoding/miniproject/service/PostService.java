package shop.mtcoding.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.miniproject.dto.post.PostReq.PostSaveReqDto;
import shop.mtcoding.miniproject.dto.post.PostReq.PostUpdateReqDto;
import shop.mtcoding.miniproject.handler.ex.CustomApiException;
import shop.mtcoding.miniproject.model.Post;
import shop.mtcoding.miniproject.model.PostRespository;
import shop.mtcoding.miniproject.model.Skill;
import shop.mtcoding.miniproject.model.SkillRepository;

@Transactional // 여기 붙이면 모든 메서드에 다 붙음
@Service
public class PostService {
    @Autowired
    private PostRespository postRespository;
    @Autowired
    private SkillRepository skillRepository;

    public int 공고등록(PostSaveReqDto postSaveReqDto, int cInfoId) {
        Post post = new Post(postSaveReqDto, cInfoId);
        int result = postRespository.insert(post);
        if (result != 1) {
            throw new CustomApiException("공고 등록 실패", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        String[] st = postSaveReqDto.getSkills();
        String skills = "";
        for (String string : st) {
            if (!skills.equals(""))
                skills += ",";
            skills += string;
        }
        int result1 = skillRepository.insert(0, post.getId(), 0, skills);
        if (result1 != 1) {
            throw new CustomApiException("공고 등록 실패", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return post.getId();
    }

    public void 공고수정하기(PostUpdateReqDto postUpdateReqDto, int postId, int cInfoId) {
        Post postPS = postRespository.findById(postId);
        if (postPS == null) {
            throw new CustomApiException("없는 공고를 수정할 수 없습니다.");
        }
        postPS = Post.postSetting(postPS, postUpdateReqDto, cInfoId);

        try {
            postRespository.updateById(postPS.getId(), postPS.getTitle(), postPS.getCInfoId(),
                    postPS.getCareer(), postPS.getPay(), postPS.getCondition(), postPS.getStartHour(),
                    postPS.getEndHour(),
                    postPS.getDeadline(), postPS.getCIntro(), postPS.getJobIntro(), postPS.getCreatedAt());
        } catch (Exception e) {
            throw new CustomApiException("공고 수정할 수 없습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        Skill skillPS = skillRepository.findByPostId(postId);
        String st = postUpdateReqDto.getSkills(); // 수정할 스킬들

        skillPS.setSkills(st);

        int result2 = skillRepository.updateById(skillPS.getId(), skillPS.getPInfoId(), skillPS.getPostId(),
                skillPS.getResumeId(), skillPS.getSkills(), skillPS.getCreatedAt());

        if (result2 != 1) {
            throw new CustomApiException("공고 수정할 수 없습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void 공고삭제하기(int postId, int cInfoId) {
        Post postPS = postRespository.findById(postId);
        if (postPS == null) {
            throw new CustomApiException("없는 공고를 삭제 할 수 없습니다.");
        }
        if (cInfoId != postPS.getCInfoId()) {
            throw new CustomApiException("공고를 삭제 할 권한이 없습니다.", HttpStatus.FORBIDDEN);
        }

        try {
            postRespository.deleteById(postId);
        } catch (Exception e) {
            throw new CustomApiException("공고를 삭제실패.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        try {
            skillRepository.deleteByPostId(postId);
        } catch (Exception e) {
            throw new CustomApiException("공고를 삭제실패.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
