package com.example.activemqtest.publisher.controller;

import com.example.activemqtest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AJ Catambay of Bridging Code
 */
@RestController
public class PublishController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/publishMessage")
    public ResponseEntity<String> publishMessage(@RequestBody User user) {
        jmsTemplate.convertAndSend("queue", user);
        return new ResponseEntity<>("Sent.", HttpStatus.OK);

    }
}
