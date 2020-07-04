package com.hyx.dao;

import com.hyx.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findOne(User user);
    int insert(User user);

}