package com.example.demo.service;

import org.springframework.context.annotation.Configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;

@Configuration
@EncryptablePropertySource(value = "application.properties")
public class SimpleJasyptApplicationConfiguration {

}

