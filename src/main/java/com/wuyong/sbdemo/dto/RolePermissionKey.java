package com.wuyong.sbdemo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 角色  -   权限
 */


@Embeddable
@Getter
@Setter
public class RolePermissionKey implements Serializable{

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "permission_id")
    private Integer permissionId;
}
