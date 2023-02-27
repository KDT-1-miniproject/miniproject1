package shop.mtcoding.miniproject.model;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SkillRepository {

        public List<Skill> findAll();

        public Skill findById(int id);

        public Skill findByPostId(int postId);

        public int insert(@Param("pInfoId") int pInfoId, @Param("postId") int postId,
                        @Param("resumeId") int resumeId,
                        @Param("skills") String skills);

        public int updateById(@Param("id") int id,
                        @Param("pInfoId") int pInfoId,
                        @Param("postId") int postId,
                        @Param("resumeId") int resumeId,
                        @Param("skills") String skills,
                        @Param("createdAt") Timestamp createdAt);

        public int deleteById(int id);

}
