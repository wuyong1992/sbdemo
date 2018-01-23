package com.wuyong.sbdemo.repository;

import com.wuyong.sbdemo.dto.RolePermission;
import com.wuyong.sbdemo.dto.RolePermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
public interface RolePermissionRepository extends JpaRepository<RolePermission,RolePermissionKey> {

//    @Query(nativeQuery = true, value = "select rp.permission_id from role_permission as rp where rp.role_id in :rids")
//    Set<Integer> findPermissionIdByRoleIdIn(@Param("rids") Collection rids);


    @Query(nativeQuery = true, value = "select rp.permission_id from role_permission as rp where rp.role_id = :rid")
    Set<Integer> findPermissionIdByRoleId(@Param("rid") Integer rid);
}
