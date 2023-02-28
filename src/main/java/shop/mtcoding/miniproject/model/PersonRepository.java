package shop.mtcoding.miniproject.model;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonRepository {
        public List<Person> findAll();

        public Person findById(int id);

        public User findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

        public int insert(Person person); // 이름만 필수로 들어감!
        // skill은 따로 insert 해줘서 관리해줘야함!

        public int updateById(@Param("id") int id,
                        @Param("name") String name,
                        @Param("phone") String phone,
                        @Param("address") String address,
                        @Param("birthday") Timestamp birthday,
                        @Param("createdAt") Timestamp createdAt);

        public int deleteById(int id);

}
