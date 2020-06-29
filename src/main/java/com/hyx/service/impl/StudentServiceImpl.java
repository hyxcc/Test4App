package com.hyx.service.impl;

import com.hyx.dao.StudentMapper;
import com.hyx.pojo.Student;
import com.hyx.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
