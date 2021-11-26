package com.itheima.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class StreamConsumer {
    @StreamListener(Sink.INPUT)
    public void receiveMsg(Message msg){
        System.out.println(msg);
        System.out.println(msg.getPayload());
    }
}
