package com.demo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ContentController {
    
    @GetMapping("/count")
    public String countPage() {
        return "index";
    }

    @PostMapping("/count")
    @ResponseBody
    public String handleCount() {
        return "success"; // or another page
    }

    @GetMapping("/admin")
    @ResponseBody
    public String adminPage() {
        return "Welcome Admin";
    }

    @GetMapping("/user")
    @ResponseBody
    public String userPage() {
        return "Welcome User";
    }
}
