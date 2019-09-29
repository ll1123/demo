package com.example.demo.controller;

import com.example.demo.fegin.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/hello")
    String helloWord(){
        return helloRemote.helloWrold();
    }

}
