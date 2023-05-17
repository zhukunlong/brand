package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;


public interface UserMapper {
//    进行用户登录的接口
    @Select("select * from user where username=#{username} and password=#{password}")
    User select(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username=#{username}")
    User selectByUsername(String username);
//    添加用户
    @Select("insert into user values (null,#{username},#{password})")
    void add(User user);
}
