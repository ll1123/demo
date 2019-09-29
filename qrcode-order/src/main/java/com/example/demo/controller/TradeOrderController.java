package com.example.demo.controller;

import com.example.demo.entity.TradeOrder;
import com.example.demo.mapper.TradeOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class TradeOrderController {
    @Autowired
    TradeOrderMapper mapper ;

    @RequestMapping("/list")
    public List<TradeOrder> page(){
        List<TradeOrder> list  =   mapper.selectList(null);
        return list;
    }



}
