package com.demo.security.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private ObjectProvider<CounterService> provider;

    public int process() {
        return provider.getObject().increment();
    }
}
