package com.wuyong.sbdemo.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 角色权限
 */

@Entity
@Data
@IdClass(RolePermissionKey.class)
public class RolePermission {

    @Id
    private Integer roleId;

    @Id
    private Integer permissionId;
}
