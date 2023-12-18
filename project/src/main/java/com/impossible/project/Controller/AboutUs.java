package com.impossible.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUs {
    @RequestMapping("/AboutUs")
    public String AboutUsPage() {
        return "AboutUs";
    }
}
    
