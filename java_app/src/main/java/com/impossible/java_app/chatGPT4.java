package com.impossible.java_app;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chatGPT4 {
    @RequestMapping("/chatGPT4")
    public String ChatWithGPT() {
        
        return "index";
    }
}
