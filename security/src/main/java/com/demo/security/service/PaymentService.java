package com.demo.security.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class PaymentService {

    public PaymentService() {
        System.out.println("Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("Post Constructor called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Constructor called");
    }
}
