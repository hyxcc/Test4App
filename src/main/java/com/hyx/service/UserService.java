package com.hyx.service;


import com.hyx.pojo.User;
import org.springframework.stereotype.Service;

@Service("userService")
public interface UserService {

    User findOne(User user);
    int insert (User user);

}