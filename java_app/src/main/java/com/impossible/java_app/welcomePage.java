package com.impossible.java_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomePage {
    @RequestMapping("/")
    public String mainPage() {
        return "Welcome to my web!";
    }
}
