package com.example.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloWordFallBack")
    String helloWord(){
        return restTemplate.getForEntity("http://hello-word/hello",String.class).getBody();
    }

    String helloWordFallBack(){
        return "error";
    }
}
