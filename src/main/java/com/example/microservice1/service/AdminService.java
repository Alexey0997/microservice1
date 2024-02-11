package com.example.microservice1.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public String getText() {
        return "Admin";
    }
}