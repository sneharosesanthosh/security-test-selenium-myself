package com.example.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InMemoryUserDetails {




    public UserDetailsService inMemoryUserDetailsManager() {

        GrantedAuthority admin = new SimpleGrantedAuthority("admin");
        GrantedAuthority user = new SimpleGrantedAuthority("user");

        UserDetails sneha = new User("sneha","{noop}sneha", Arrays.asList(admin));
        return new InMemoryUserDetailsManager(sneha);
    }

}
