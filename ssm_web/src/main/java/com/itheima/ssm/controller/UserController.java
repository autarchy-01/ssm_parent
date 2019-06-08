package com.itheima.ssm.controller;

import com.itheima.ssm.entity.User;
import com.itheima.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author silent
 * @version 1.0
 * @date 2019/6/5 21:22
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/findUser",method = RequestMethod.GET)
    public String findUserByName(String username) {
        System.out.println(username);
        User user = userService.findUserByName(username);
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/save")
    public String saveUser(User user){
        System.out.println("保存方法");
        int row = userService.saveUser(user);
        if (row==1){
            return "success";
        }
        return "error";
    }
}
