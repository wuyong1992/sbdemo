package com.wuyong.sbdemo.model;

import com.google.common.collect.Sets;
import lombok.Data;

import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 用户模型
 */
@Data
public class UserModel {

    private Integer id;

    private String username;

    private String password;

    private Set<RoleModel> roleModelSet = Sets.newHashSet();
}
