package com.wuyong.sbdemo.repository;

import com.wuyong.sbdemo.dto.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {


    Set<Role> findAllByRidIn(Collection rids);


}
