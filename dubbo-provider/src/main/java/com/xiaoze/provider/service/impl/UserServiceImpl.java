package com.xiaoze.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoze.api.entity.User;
import com.xiaoze.api.service.UserService;
import com.xiaoze.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service
@Component //注册为spring bean
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
//        User user = new User();
//        user.setUsername("qq");
        //        return user;
        return userMapper.findUserByUsername(username);
    }
}
