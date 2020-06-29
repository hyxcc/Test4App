package com.hyx.dao;

import com.hyx.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    List<Student> selectAll();
}