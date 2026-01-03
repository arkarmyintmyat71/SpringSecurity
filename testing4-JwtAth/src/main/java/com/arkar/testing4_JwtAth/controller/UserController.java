package com.arkar.testing4_JwtAth.controller;

import com.arkar.testing4_JwtAth.model.Users;
import com.arkar.testing4_JwtAth.repository.UserRepo;
import com.arkar.testing4_JwtAth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users users) {
        return this.userService.register(users);
    }
}
