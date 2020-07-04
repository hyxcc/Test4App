package com.hyx.service.impl;

import com.hyx.dao.UserMapper;
import com.hyx.pojo.User;
import com.hyx.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findOne(User user) {
        return userMapper.findOne(user);
    }

    @Override
    public int insert(User user) {
        user.setNumber(9752);
        return userMapper.insert(user);
    }
}