package com.wuyong.sbdemo.repository;

import com.wuyong.sbdemo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by JianGuo
 * on 2018/1/23
 * description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUsername(String username);

}
