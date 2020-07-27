package com.hf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 温柔一刀
 * @create 2020-07-26 22:54
 **/
@RestController
@RequestMapping("/order")
public class TestController {
    private String URL = "http://EUREKA-CLIENT-PROVIDE";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrder/{odId}")
    public String getOrder(@PathVariable("odId") int odId) {

        return  restTemplate.getForObject(URL + "/order/getOrder/" + odId, String.class);

    }
}
