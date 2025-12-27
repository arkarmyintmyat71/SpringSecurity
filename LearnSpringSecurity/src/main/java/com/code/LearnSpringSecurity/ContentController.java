package com.code.LearnSpringSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {
    @GetMapping("/")
    public String handelWelcome() {
        return "home";
    }
    
    @GetMapping("/admin")
    public String handelAdminWelcome() {
        return "admin";
    }
    
    @GetMapping("/user")
    public String handelUserWelcome() {
        return "user";
    }
}
