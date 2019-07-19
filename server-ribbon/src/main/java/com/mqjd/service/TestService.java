package com.mqjd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorService")
    public String testService(String message) {
    	String result = restTemplate.getForObject("http://CLIENT-EUREKA/api?message=" + message, String.class);
        return result;
    }
    
    public String errorService(String message) {
        return "this serveice is error, message is '" + message + "'";
    }
}
