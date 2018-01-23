package com.wuyong.sbdemo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 用户  -   角色
 * 联合主键解决办法
 * 1.实现Serializable接口(否则会报错，错误会直接显示);
 * 2.在复合主键的类上，使用注解@Embeddable
 * 3.有默认的public无参数的构造方法
 * 4.重写equals和hashCode方法
 */


@Embeddable
@Getter@Setter
public class UserRoleKey implements Serializable{

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;
}
