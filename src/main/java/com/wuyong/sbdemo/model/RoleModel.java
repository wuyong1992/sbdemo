package com.wuyong.sbdemo.model;

import com.google.common.collect.Sets;
import lombok.Data;

import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 角色模型
 */
@Data
public class RoleModel {

    private Integer rid;

    private String name;

    private Set<PermissionModel> permissionModelSet = Sets.newHashSet();

    private Set<UserModel> userModelSet = Sets.newHashSet();
}
