package com.arkar.testing2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping
    public List<String> getAllStudents() {
        return List.of("Alice", "Bob", "Charlie");
    }

    @PostMapping
    public String addStudent(@RequestBody String name) {
        return "Student " + name + " added!";
    }

    @DeleteMapping("/{name}")
    public String deleteStudent(@PathVariable String name) {
        return "Student " + name + " deleted!";
    }
}
