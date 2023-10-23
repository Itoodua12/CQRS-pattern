package com.bankservice.cqrs.core.producers;

import com.bankservice.cqrs.core.events.BaseEvent;

public interface EventProducer {

    void producer(String topic, BaseEvent event);
}
