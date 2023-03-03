package shop.mtcoding.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.miniproject.handler.ex.CustomApiException;
import shop.mtcoding.miniproject.model.PersonProposal;
import shop.mtcoding.miniproject.model.PersonProposalRepository;
import shop.mtcoding.miniproject.model.Post;
import shop.mtcoding.miniproject.model.PostRepository;

@Service
@Transactional
public class PersonProposalService {
    @Autowired
    private PersonProposalRepository personProposalRepository;
    @Autowired
    private PostRepository postRepository;

    public void 제안수정하기(int proposalId, int cInfoId, int status) {

        PersonProposal proposal = personProposalRepository.findById(proposalId);
        if (proposal == null) {
            throw new CustomApiException("없는 제안을 확인 할 수 없습니다.");
        }
        Post post = postRepository.findById(proposal.getPostId());
        if (post == null) {
            throw new CustomApiException("없는 공고에 대한 제안을 확인 할 수 없습니다.");
        }
        if (post.getCInfoId() != cInfoId) {
            throw new CustomApiException("본인의 공고가 아니면 제안을 확인 할 수 없습니다.");
        }
        proposal.setStatus(status);
        personProposalRepository.updateById(proposal.getId(), proposal.getPInfoId(), proposal.getPostId(),
                proposal.getResumeId(), proposal.getStatus(), proposal.getCreatedAt());
    }
}
