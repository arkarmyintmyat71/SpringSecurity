package com.arkar.testing4_JWTAth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
public class HelloController {
    @GetMapping("/")
    public String greeting(HttpServletRequest request) {
        return "Hello, Arkar Welcome to Spring Security! " + request.getSession().getId();
    }
    
}
