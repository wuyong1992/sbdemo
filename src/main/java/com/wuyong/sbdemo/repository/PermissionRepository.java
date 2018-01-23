package com.wuyong.sbdemo.repository;

import com.wuyong.sbdemo.dto.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer> {


    Set<Permission> findAllByPidIn(Collection pids);

//    Permission
}
