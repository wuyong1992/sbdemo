package com.wuyong.sbdemo.dto;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 用户角色表
 * 联合主键可以继承也可以使用@IdClass
 */

@Data
@Entity
@IdClass(UserRoleKey.class)
public class UserRole  {

    @Id
    private Integer userId;

    @Id
    private Integer roleId;
}
