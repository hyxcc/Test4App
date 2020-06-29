package com.hyx.service;

import com.hyx.pojo.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("professionService")
public interface ProfessionService {
    List<Profession> selectAll(Profession profession);
}
