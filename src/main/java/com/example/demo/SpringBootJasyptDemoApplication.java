package com.example.demo;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.jasypt.iv.StringFixedIvGenerator;
import org.jasypt.salt.StringFixedSaltGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJasyptDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJasyptDemoApplication.class, args);
	}
/*
    @Bean(name = "encryptorBean")
    public StringEncryptor stringEncryptor() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("password");
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        return encryptor;
    }
*/
	

    @Bean(name = "encryptorBean")
    public StringEncryptor stringEncryptor() {
    	
    	StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("@4pAnother2021");
        config.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        config.setKeyObtentionIterations("10000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGenerator(new StringFixedSaltGenerator("01010202030304040505"));
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        encryptor.setIvGenerator(new StringFixedIvGenerator("012003400560078009"));
        
         return encryptor;
    }

	
	
}
