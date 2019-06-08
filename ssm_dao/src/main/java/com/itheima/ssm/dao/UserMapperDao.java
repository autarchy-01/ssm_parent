package com.itheima.ssm.dao;

import com.itheima.ssm.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author silent
 * @version 1.0
 * @date 2019/6/6 0:18
 **/
@Repository
public interface UserMapperDao {
    @Select("select * from user")
    List<User> findAllUser();

    @Select("select * from user where username=#{username}")
    User findUserByName(String username);

    @Insert("insert into user(username, password, tel, email) values (#{username},#{password},#{tel},#{email})")
    int saveUser(User user);
}
