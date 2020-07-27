package com.hf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 温柔一刀
 * @create 2020-07-26 22:40
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getOrder/{odId}")
    public String getOrder(@PathVariable("odId") int odId) {

        return "来自:" + serverPort + " 服务 ;订单" + odId + "查询成功！";
    }
}
