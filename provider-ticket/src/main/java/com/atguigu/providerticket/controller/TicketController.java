package com.atguigu.providerticket.controller;

import com.atguigu.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2018-11-29 16:00
 */
@RestController
public class TicketController {

    @Autowired
    public TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        System.out.println("端口号8001");
        return ticketService.getTicket();
    }

}
