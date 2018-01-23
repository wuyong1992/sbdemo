package com.wuyong.sbdemo.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 角色
 */

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer rid;

    private String name;
}
