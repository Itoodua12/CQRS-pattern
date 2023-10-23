package com.bankservice.cqrs.core.handlers;

import com.bankservice.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {

    void save(AggregateRoot aggregateRoot);
    T getById(String id);
}
