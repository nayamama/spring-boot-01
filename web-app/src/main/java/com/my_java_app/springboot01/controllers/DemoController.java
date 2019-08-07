package com.my_java_app.springboot01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){
        Map<String, Object> returnval = new HashMap<>();
        returnval.put("Hello", "Meng");
        return returnval;
    }
}
