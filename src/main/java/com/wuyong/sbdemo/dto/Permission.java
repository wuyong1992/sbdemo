package com.wuyong.sbdemo.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 权限
 */

@Data
@Entity
public class Permission {
    @Id
    @GeneratedValue
    private Integer pid;

    private String name;

    private String url;
}
