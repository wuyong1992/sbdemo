package com.wuyong.sbdemo.Service;

import com.wuyong.sbdemo.model.UserModel;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
public interface UserService {

    UserModel findUserByUsername(String username);
}
