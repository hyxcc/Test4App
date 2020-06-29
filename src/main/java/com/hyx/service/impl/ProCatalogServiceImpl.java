package com.hyx.service.impl;

import com.hyx.dao.ProCatalogMapper;
import com.hyx.dao.StudentMapper;
import com.hyx.pojo.ProCatalog;
import com.hyx.pojo.Student;
import com.hyx.service.ProCatalogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProCatalogServiceImpl implements ProCatalogService {
    @Resource
    private ProCatalogMapper proCatalogMapper;
    @Override
    public List<ProCatalog> selectAll() {
        return proCatalogMapper.selectAll();
    }
}
