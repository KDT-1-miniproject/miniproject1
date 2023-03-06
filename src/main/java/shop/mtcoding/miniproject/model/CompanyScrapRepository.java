package shop.mtcoding.miniproject.model;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.miniproject.dto.companyScrap.CompanyScrapResDto.CompanyScrapWithResumeInfoResDto;

@Mapper
public interface CompanyScrapRepository {
        public List<CompanyScrap> findAll();

        public CompanyScrap findById(int id);

        public CompanyScrap findByCInfoIdAndResumeId(@Param("cInfoId") int cInfoId, @Param("resumeId") int resumeId);

        public List<CompanyScrapWithResumeInfoResDto> findresumeTitleAndNameByCInfoId(int cInfoId);

        public int insert(@Param("cInfoId") int cInfoId,
                        @Param("resumeId") int resumeId);

        public int updateById(@Param("id") int id,
                        @Param("cInfoId") int cInfoId,
                        @Param("resumeId") int resumeId);

        public int deleteById(int id);
}
