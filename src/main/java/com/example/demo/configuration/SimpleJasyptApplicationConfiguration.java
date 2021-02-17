package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;

@Configuration
@EncryptablePropertySource(value = "application.properties")
public class SimpleJasyptApplicationConfiguration {

}

