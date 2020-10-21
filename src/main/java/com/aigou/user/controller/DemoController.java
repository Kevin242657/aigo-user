package com.aigou.user.controller;

import com.aigou.user.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoController")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("/demo")
    public String Demo(){
        return demoService.demo();
    }

}
