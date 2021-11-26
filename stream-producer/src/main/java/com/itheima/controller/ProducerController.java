package com.itheima.controller;

import com.itheima.producer.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private MsgProducer msgProducer;
    @GetMapping("/send")
    public String send(){
        msgProducer.sendMsg();
        return "success";
    }
}
