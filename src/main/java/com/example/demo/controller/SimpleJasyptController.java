package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SimpleJasyptService;


@RestController
public class SimpleJasyptController {
	
	@Autowired
	SimpleJasyptService service;

	private static Logger logger = LoggerFactory.getLogger(SimpleJasyptController.class);
	
    @RequestMapping("/")
    @ResponseBody
    public String getKey() {
    	logger.info("key 1 = " + service.getKey1());
    	logger.info("key 2 = " + service.getKey2());
    	StringBuffer sb = new StringBuffer();
    	sb.append("<h1> key 1 = " + service.getKey1() + "</h1>");
    	sb.append("<h2> key 2 = " + service.getKey2() + "</h2>");
        return sb.toString();
    }

}


