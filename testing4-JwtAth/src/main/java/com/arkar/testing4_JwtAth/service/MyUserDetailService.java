package com.arkar.testing4_JwtAth.service;

import com.arkar.testing4_JwtAth.model.UserPrinciple;
import com.arkar.testing4_JwtAth.model.Users;
import com.arkar.testing4_JwtAth.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = this.userRepo.findByUsername(username);
        if (users == null) {
            throw new UsernameNotFoundException("User Not Found!");
        }
        return new UserPrinciple(users);
    }
}
