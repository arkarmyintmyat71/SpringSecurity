package com.arkar.spring_security_basic_auth.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class WelcomeController {

    @GetMapping("/greeting")
    public String greeting(Authentication authentication) {
        String name = authentication.getName();
        return "Welcome " + name + " to Spring Security Basic Authentication";
    }
    
}
