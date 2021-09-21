package com.example.demo.controller;

import com.example.demo.config.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * UserController
 *
 * @author jiankang.xu
 * @date 2021/8/28
 */

@RestController
public class HelloController {


    @Autowired
    private ResourceConfig resourceConfig;

    @RequestMapping("/resource")
    @ResponseBody
    public HashMap getA()
    {
        HashMap map = new HashMap();
        map.put("com.name", resourceConfig.getName());
        map.put("com.phone", resourceConfig.getPhone());
        map.put("com.language", resourceConfig.getLanguage());
        map.put("com.address", resourceConfig.getAddress());
        return map;
    }

}
