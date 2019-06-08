package com.itheima.ssm.service;

import com.itheima.ssm.entity.User;

import java.util.List;

/**
 * @author silent
 * @version 1.0
 * @date 2019/6/6 0:32
 **/
public interface UserService {
    List<User> findAllUser();

    User findUserByName(String username);

    int saveUser(User user);
}
