package com.pedrorafante.springconsumer.service;

import com.pedrorafante.springconsumer.dto.Message;

public interface ConsumerService {

    void action(Message message) throws Exception;
}
