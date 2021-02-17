package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.example.demo.service.SimpleJasyptService;

@SpringBootTest
class SpringBootJasyptDemoApplicationTests {
    @Autowired
    ApplicationContext appCtx;
	
	@Test
	void contextLoads() {
	}
	
    @Test
    public void whenDecryptedKey1Needed_GetFromService() {
        SimpleJasyptService service = appCtx
          .getBean(SimpleJasyptService.class);
     
        assertEquals("Password@1", service.getKey1());
     
        Environment environment = appCtx.getBean(Environment.class);
     
        assertEquals(
          "Password@1", 
          service.getKey1UsingEnvironment(environment));
    }    	
    
    @Test
    public void whenDecryptedKey2Needed_GetFromService() {
        SimpleJasyptService service = appCtx.getBean(SimpleJasyptService.class);
        assertEquals("Password@2", service.getKey2());
        
        Environment environment = appCtx.getBean(Environment.class);
     
        assertEquals(
          "Password@2", 
          service.getKey2UsingEnvironment(environment));

    }
    
    @Test
    public void whenConfiguredExcryptorUsed_ReturnCustomEncryptor() {
        Environment environment = appCtx.getBean(Environment.class);
        assertEquals("Password@3", environment.getProperty("customkey"));
    }
    
        

}
