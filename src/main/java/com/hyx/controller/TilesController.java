package com.hyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/tiles")
public class TilesController {

    @RequestMapping(value = "/main")
    public String tilesTest1(){
        return "menu";
    }
    @RequestMapping(value = "/content")
    public String tilesTest2(){
        return "content";
    }
}
