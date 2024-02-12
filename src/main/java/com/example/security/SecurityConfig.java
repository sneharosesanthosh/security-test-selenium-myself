package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain overrideSecurityConfig(HttpSecurity http) throws Exception {
//        http.csrf(customizer->customizer.disable());
//        http.formLogin(customizer-> Customizer.withDefaults());
//        http.httpBasic(customizer-> Customizer.withDefaults());
//        http.authorizeHttpRequests(
//                customizer->
//                        customizer
//                                .requestMatchers("/hi").permitAll()
//                                .requestMatchers("/hello").denyAll()
//                                .anyRequest().authenticated());
//
//
//        return http.build();
//
//
//    }




    @Bean
    public InMemoryUserDetailsManager setUpUser() {

        List<GrantedAuthority> authoritiesList = new ArrayList<>();

        SimpleGrantedAuthority admin = new SimpleGrantedAuthority("ADMIN");
        SimpleGrantedAuthority user = new SimpleGrantedAuthority("USER");

        authoritiesList.add(admin);
        authoritiesList.add(user);
        // CREATE USER
        UserDetails sneha = new User("sneha", "{noop}sneha", authoritiesList);

        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();

        return

    }





}
