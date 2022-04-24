package com.pedrorafante.springconsumer.service.implementation;

import com.pedrorafante.springconsumer.dto.Message;
import com.pedrorafante.springconsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(Message message) {
        System.out.println(message.getText());
    }
}
