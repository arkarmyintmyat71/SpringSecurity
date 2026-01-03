package com.arkar.testing4_JwtAth.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String greeting(HttpServletRequest request) {
        return "Hello, Arkar Welcome to Spring Security! " + request.getSession().getId();
    }
}
