package com.wuyong.sbdemo.Service.impl;

import com.google.common.collect.Sets;
import com.wuyong.sbdemo.Service.UserService;
import com.wuyong.sbdemo.dto.Permission;
import com.wuyong.sbdemo.dto.Role;
import com.wuyong.sbdemo.dto.User;
import com.wuyong.sbdemo.dto.UserRole;
import com.wuyong.sbdemo.model.PermissionModel;
import com.wuyong.sbdemo.model.RoleModel;
import com.wuyong.sbdemo.model.UserModel;
import com.wuyong.sbdemo.repository.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RolePermissionRepository rolePermissionRepository;
    @Autowired
    private PermissionRepository permissionRepository;



    @Override
    public UserModel findUserByUsername(String username) {
        // 1 查出用户
        User user = userRepository.findUserByUsername(username);
        // 2 根据用户id在 用户-角色表 查出所有角色id集合
        Set<Integer> roleIds = userRoleRepository.findRoleIdByUserId(user.getId());
        // 3 根据角色id查出角色
        Set<Role> roles = roleRepository.findAllByRidIn(roleIds);
        // 4 根据角色id在 角色-权限表 查出权限id集合
        // 5 根据权限id在权限表查出所有权限信息

        Set<RoleModel> roleModels = Sets.newHashSet();
        RoleModel roleModel = null;
        roleIds.stream().forEach(
                rid->{
                    Role role = roleRepository.getOne(rid);
                    roleModel.setRid(role.getRid());
                    roleModel.setName(role.getName());
                    Set<Integer> permissionIds = rolePermissionRepository.findPermissionIdByRoleId(rid);
                    Set<Permission> permissionSet = permissionRepository.findAllByPidIn(permissionIds);
                    Set<PermissionModel> permissionModelSet = Sets.newHashSet();
                    PermissionModel permissionModel ;

                    for (Permission permission : permissionSet) {
                        permissionModel = new PermissionModel();
                        BeanUtils.copyProperties(permission, permissionModel);
                        permissionModelSet.add(permissionModel);
                    }
                    roleModel.setPermissionModelSet(permissionModelSet);
                    roleModels.add(roleModel);
                }
        );

        Set<UserRole> userRoleSet = Sets.newHashSet();
        Set<Role> roleSet = Sets.newHashSet();

        UserModel userModel = new UserModel();
        userModel.setUsername(user.getUsername());
        userModel.setId(user.getId());
        userModel.setPassword(user.getPassword());
        userModel.setRoleModelSet(roleModels);

        return userModel;
    }

}
