package com.wuyong.sbdemo.controller;

import com.wuyong.sbdemo.Service.UserRoleService;
import com.wuyong.sbdemo.Service.UserService;
import com.wuyong.sbdemo.dto.UserRole;
import com.wuyong.sbdemo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */

@RestController
@RequestMapping(value = "/user_role")
public class UserRoleController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find_by_username/{username}")
    public UserModel findByUsername(@PathVariable("username") String username) {
        return userService.findUserByUsername(username);
    }


}
