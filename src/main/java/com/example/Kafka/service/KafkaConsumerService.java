package com.example.Kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "quickstart-events", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}