package com.hyx.dao;

import com.hyx.pojo.Profession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionMapper {
    List<Profession> selectAll(Profession profession);
}