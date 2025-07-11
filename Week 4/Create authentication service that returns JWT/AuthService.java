package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean validate(String username, String password){
        return "user".equals(username) && "pwd".equals(password);
    }
}
