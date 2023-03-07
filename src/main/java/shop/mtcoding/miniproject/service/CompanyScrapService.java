package shop.mtcoding.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.miniproject.handler.ex.CustomApiException;
import shop.mtcoding.miniproject.model.CompanyScrap;
import shop.mtcoding.miniproject.model.CompanyScrapRepository;
import shop.mtcoding.miniproject.model.Resume;
import shop.mtcoding.miniproject.model.ResumeRepository;

@Service
@Transactional
public class CompanyScrapService {

    @Autowired
    private CompanyScrapRepository companyScrapRepository;

    @Autowired
    private ResumeRepository resumeRepository;

    public void delete(int id, int cInfoId) {
        CompanyScrap csPS = companyScrapRepository.findByCInfoIdAndResumeId(cInfoId, id);
        if (csPS == null) {
            throw new CustomApiException("스크랩 이력이 존재하지 않습니다!", HttpStatus.UNAUTHORIZED);
        }

        if (csPS.getCInfoId() != cInfoId) {
            throw new CustomApiException("취소 권한이 없습니다!", HttpStatus.FORBIDDEN);
        }

        int result = companyScrapRepository.deleteById(csPS.getId());
        if (result != 1) {
            throw new CustomApiException("서버 오류!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void insert(int id, int cInfoId) {
        Resume resumePS = resumeRepository.findById(id);
        if (resumePS == null) {
            throw new CustomApiException("존재하지 않는 이력서입니다", HttpStatus.UNAUTHORIZED);
        }

        int result = companyScrapRepository.insert(cInfoId, id);
        if (result != 1) {
            throw new CustomApiException("서버 에러!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
