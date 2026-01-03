package com.arkar.testing4_JwtAth.controller;

import com.arkar.testing4_JwtAth.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Arkar", 97),
            new Student(2, "Aung", 88),
            new Student(3, "Mya", 92)
    ));

    @GetMapping("/all")
    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
