package com.hyx.service.impl;

import com.hyx.dao.ProfessionMapper;
import com.hyx.pojo.Profession;
import com.hyx.service.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Resource
    private ProfessionMapper professionMapper;
    @Override
    public List<Profession> selectAll(Profession profession) {
        return professionMapper.selectAll(profession);
    }
}
