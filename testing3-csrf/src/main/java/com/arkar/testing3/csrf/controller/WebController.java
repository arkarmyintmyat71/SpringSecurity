package com.arkar.testing3.csrf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("message", "");
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "form";
    }
}
