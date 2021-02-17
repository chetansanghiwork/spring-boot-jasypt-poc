package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class SimpleJasyptService {
	
    @Value("${key1}")
    private String key1;

    
    @Value("${key2}")
    private String key2;
    
    
    public String getKey1() {
        return key1;
    }

    public String getKey1UsingEnvironment(Environment environment) {
        return environment.getProperty("key1");
    }
    
    public String getKey2() {
        return key2;
    }

    public String getKey2UsingEnvironment(Environment environment) {
        return environment.getProperty("key2");
    }
    
}

