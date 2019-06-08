package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.UserMapperDao;
import com.itheima.ssm.entity.User;
import com.itheima.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author silent
 * @version 1.0
 * @date 2019/6/6 0:32
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapperDao userMapperDao;

    @Override
    public List<User> findAllUser() {
        return userMapperDao.findAllUser();
    }

    @Override
    public User findUserByName(String username) {
        return userMapperDao.findUserByName(username);
    }

    @Override
    public int saveUser(User user) {
        return userMapperDao.saveUser(user);
    }
}
