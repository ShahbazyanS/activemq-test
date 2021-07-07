package com.example.activemqtest.consumer.component;

import com.example.activemqtest.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "queue")
    public void messageListener(User user) {
        LOGGER.info("Message received! {}", user);
    }
}
