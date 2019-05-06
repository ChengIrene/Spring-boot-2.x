package com.springboot.chapter3.controller;

import com.springboot.chapter3.pojo.definition.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DiController {

    @Autowired
    private Person p = null;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, Boolean> test() {
        Map<String, Boolean> m = new HashMap<>();
        m.put("di", p != null);
        p.service();  //帶動物看是否能注入
        return m;
    }

}
