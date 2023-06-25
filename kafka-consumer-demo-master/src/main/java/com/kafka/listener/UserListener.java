package com.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {

    @KafkaListener(topics = "message_topic", groupId = "message_group")
    public void userListener(String message) {
        System.out.println(message);
    }

}