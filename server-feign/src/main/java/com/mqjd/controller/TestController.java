package com.mqjd.controller;


import com.mqjd.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ITestService iTestService;

    @GetMapping(value = "/api")
    public String testService(@RequestParam String message) {
        return iTestService.testService(message);
    }
}
