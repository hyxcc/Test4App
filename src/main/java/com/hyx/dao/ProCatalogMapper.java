package com.hyx.dao;

import com.hyx.pojo.ProCatalog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProCatalogMapper {
    List<ProCatalog> selectAll();
}