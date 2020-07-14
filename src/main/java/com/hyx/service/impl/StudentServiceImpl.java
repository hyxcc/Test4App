package com.hyx.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyx.dao.StudentMapper;
import com.hyx.pojo.Student;
import com.hyx.service.StudentService;
import com.hyx.util.JedisUtil;
import com.hyx.util.MemcachedUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Autowired
    private JedisUtil.Keys jedisKeys;
    @Autowired
    private JedisUtil.Strings jedisStrings;
    //常量key
    private static String STULIST =  "stuList";
    private Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public List<Student> selectAll() {
        String key = STULIST;
        List<Student> stuList = null;
        //jackson转换，String和对象的转换
        ObjectMapper mapper = new ObjectMapper();
        //如果缓存没有key，则查询数据库，把值放到缓存中，最后返回数据
        //否则key存在，直接从缓存中取数据
        if(!jedisKeys.exists(key)){
            stuList = studentMapper.selectAll();
            String jsonString = null;
            try {
                //list转换为String
                jsonString = mapper.writeValueAsString(stuList);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
                jedisStrings.set(key,jsonString);
        }else{
            String jsonString = jedisStrings.get(key);
            //String类型转换为java对象
            JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class,Student.class);
            try {
                stuList = mapper.readValue(jsonString,javaType);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
        return stuList;
    }
}


