package com.demo.security.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CounterService {
    private int count = 0;

    public int increment() {
        return ++count;
    }
}
