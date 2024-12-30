package com.example.Kafka.controller;

import com.example.Kafka.service.KafkaConsumerService;
import com.example.Kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/addMessage")
    public String sendMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage("quickstart-events", message);
        return "success";
    }

}
