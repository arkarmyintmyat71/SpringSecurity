package com.demo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.service.CounterService;

@RestController
@RequestMapping("/test")
public class TestingController {

    private final CounterService counterService;

    public TestingController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/count")
    public int count() {
        return counterService.increment();
    }
}
