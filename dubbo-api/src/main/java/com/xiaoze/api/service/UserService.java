package com.xiaoze.api.service;

import com.xiaoze.api.entity.User;

import java.util.List;

/**
 * Interface description
 *
* @author         donghuarui.
 */
public interface UserService {

    /**
     * 根据用户名查询用户
     *
     *
     * @param username
     *
     * @return
     */
    User findUserByUsername(String username);
}
