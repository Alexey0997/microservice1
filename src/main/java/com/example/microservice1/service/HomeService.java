package com.example.microservice1.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getText() {
        return "Home";
    }

}