package com.wuyong.sbdemo.repository;

import com.wuyong.sbdemo.dto.UserRole;
import com.wuyong.sbdemo.dto.UserRoleKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleKey> {


    @Query(nativeQuery = true,value = "select up.role_id from user_permission as up where up.user_id = :uid")
    Set<Integer> findRoleIdByUserId(@Param("uid") Integer id);

}
