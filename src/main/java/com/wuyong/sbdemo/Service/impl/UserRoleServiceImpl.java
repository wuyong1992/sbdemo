package com.wuyong.sbdemo.Service.impl;

import com.wuyong.sbdemo.Service.UserRoleService;
import com.wuyong.sbdemo.dto.UserRole;
import com.wuyong.sbdemo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;


    @Override
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

}
