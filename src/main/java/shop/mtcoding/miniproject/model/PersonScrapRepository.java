package shop.mtcoding.miniproject.model;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.miniproject.dto.personScrap.PersonScrapResDto.PersonScrapTimeStampResDto;

@Mapper
public interface PersonScrapRepository {
    public List<PersonScrap> findAll();

    public PersonScrap findById(int id);

    public List<PersonScrapTimeStampResDto> findByPInfoId(int pInfoId);

    public PersonScrap findByPInfoIdAndPostId(@Param("pInfoId") int pInfoId,
            @Param("postId") int postId);

    public int insert(@Param("pInfoId") int pInfoId,
            @Param("postId") int postId,
            @Param("createdAt") Timestamp createdAt);

    public int updateById(@Param("id") int id,
            @Param("pInfoId") int pInfoId,
            @Param("postId") int postId,
            @Param("createdAt") Timestamp createdAt);

    public int deleteById(int id);
}
