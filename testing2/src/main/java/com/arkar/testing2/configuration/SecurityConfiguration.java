package com.arkar.testing2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                // Order matters! Put specific rules first
                .requestMatchers(HttpMethod.POST, "/student").hasRole("TEACHER")
                .requestMatchers(HttpMethod.DELETE, "/student/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET, "/student").hasAnyRole("TEACHER", "ADMIN")

                // any other request requires authentication
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .formLogin(Customizer.withDefaults())
            .logout(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    InMemoryUserDetailsManager userDetailsService() {
        UserDetails teacher = User
            .withUsername("teacherUser")
            .password("{noop}teacher123")
            .roles("TEACHER")
            .build();

        UserDetails admin = User
            .withUsername("adminUser")
            .password("{noop}admin123")
            .roles("ADMIN")
            .build();

        return new InMemoryUserDetailsManager(teacher, admin);
    }
}
