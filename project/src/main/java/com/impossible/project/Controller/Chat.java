package com.impossible.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chat {
    @RequestMapping("/StartChatting")
    public String startChat() {
        return "Chat";
    }

}
