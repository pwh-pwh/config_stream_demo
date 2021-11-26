package com.itheima.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class MsgProducer {
    @Autowired
    @Qualifier("output")
    private MessageChannel messageChannel;
    public void sendMsg(){
        String msg = "my test msg";
        messageChannel.send(MessageBuilder.withPayload(msg).build());
        System.out.println("msg success send");
    }
}
