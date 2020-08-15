package com.qlz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @RequestMapping("select")
    public String select(){
        return "PorductB---查询订单信息";
    }
}
