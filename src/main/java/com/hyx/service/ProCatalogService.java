package com.hyx.service;

import com.hyx.pojo.ProCatalog;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("procatalogService")
public interface ProCatalogService {
    List<ProCatalog> selectAll();
}
