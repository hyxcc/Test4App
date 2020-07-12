package com.hyx.service.impl;

import com.danga.MemCached.MemCachedClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyx.dao.UserMapper;
import com.hyx.pojo.Student;
import com.hyx.pojo.User;
import com.hyx.service.UserService;
import com.hyx.util.JedisUtil;
import com.hyx.util.MemcachedUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private JedisUtil.Keys jedisKey;
    @Autowired
    JedisUtil.Strings jedisString;
    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public User findOne(User user) {
        return userMapper.findOne(user);
    }

    @Override
    public int insert(User user) {
        user.setNumber(9527);
        String key;
        ObjectMapper mapper = new ObjectMapper();
        log.info("新建数据写入缓存中");
        key = user.getName();
        String jsonString = null;
        if(!jedisKey.exists(key)){
            //java对象转换为String类型
               try {
                jsonString = mapper.writeValueAsString(user);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                log.error(e.getMessage());
            }
            jedisString.set(key,jsonString);
        }
        return userMapper.insert(user);
    }
}