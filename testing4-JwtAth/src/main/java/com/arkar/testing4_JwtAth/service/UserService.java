package com.arkar.testing4_JwtAth.service;

import com.arkar.testing4_JwtAth.model.Users;
import com.arkar.testing4_JwtAth.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    public Users register(Users users){
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        return userRepo.save(users);
    }
}
