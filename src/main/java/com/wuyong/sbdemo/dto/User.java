package com.wuyong.sbdemo.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 用户
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private String password;
}
