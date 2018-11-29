package com.atguigu.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2018-11-29 16:20
 */

@RestController
public class UserController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("buy")
    public String buyTicket(String name){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket",String.class);
        return name + "购卖了"+s;
    }

}
