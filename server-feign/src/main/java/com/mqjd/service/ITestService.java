package com.mqjd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-eureka")
public interface ITestService {

    @RequestMapping(value = "/api",method = RequestMethod.GET)
    String testService(@RequestParam(value = "message") String message);
}
