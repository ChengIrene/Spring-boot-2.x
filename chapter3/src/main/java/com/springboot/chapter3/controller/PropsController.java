package com.springboot.chapter3.controller;

import com.springboot.chapter3.pojo.DataBaseProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PropsController {

    @Autowired
    private DataBaseProperties dbp = null;

    @RequestMapping("/dbp")
    @ResponseBody
    public DataBaseProperties getDbp() {
        return dbp;
    }
}
