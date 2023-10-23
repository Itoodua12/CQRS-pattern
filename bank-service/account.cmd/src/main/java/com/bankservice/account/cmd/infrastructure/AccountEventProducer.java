package com.bankservice.account.cmd.infrastructure;

import com.bankservice.cqrs.core.events.BaseEvent;
import com.bankservice.cqrs.core.producers.EventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountEventProducer implements EventProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void producer(String topic, BaseEvent event) {
        this.kafkaTemplate.send(topic, event);
    }
}
