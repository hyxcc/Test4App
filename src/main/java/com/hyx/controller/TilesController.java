package com.hyx.controller;

import com.hyx.pojo.ProCatalog;
import com.hyx.pojo.Profession;
import com.hyx.pojo.Student;
import com.hyx.service.ProCatalogService;
import com.hyx.service.ProfessionService;
import com.hyx.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/jnshuTest4")
public class TilesController {
    @Resource
    private StudentService studentService;
    @Resource
    private ProfessionService profession;
    @Resource
    private ProCatalogService procatalog;

    @RequestMapping(value = "/student")
    public String tilesTest1(Map<String,Object> map){
        List<Student> listStu = studentService.selectAll();
        map.put("student",listStu);
        return "menu";
    }

    /**
     * 通过map传参
     * @param map
     * @return
     */
    @RequestMapping(value = "/content")
    public String tilesTest2(Map<String,Object> map){
        //我先查出所有的职业方向分类。
        List<ProCatalog> listCatalog = procatalog.selectAll();
        map.put("proCatalog",listCatalog);
        Map<String,List<Profession>> proMap = new HashMap<>();
        //再遍历返回的职业方向集合，依次作为入参，查询该职业方向的的所有职业
        //声明个map集合，把所有的职业放在proMap中，职业方向作key，返回的list作value.
        //最后把promap放到Map中返回。
        for(ProCatalog catalog:listCatalog){
            String type = catalog.getName();
            Profession pro = new Profession();
            pro.setDvpDirection(type);
            List list = profession.selectAll(pro);
            proMap.put(type,list);
        }
        map.put("profession",proMap);
        return "content";
    }
}
