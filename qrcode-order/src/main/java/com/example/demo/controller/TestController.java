package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.TradeOrder;
import com.example.demo.mapper.TradeOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "雷礼") String name) {
        return "hi " + name + " ,i am from port:" ;
    }



}
