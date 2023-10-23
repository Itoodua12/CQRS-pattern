package com.bankservice.cqrs.core.infrastructure;

import com.bankservice.cqrs.core.commands.BaseCommand;
import com.bankservice.cqrs.core.commands.CommandHandlerMethod;

/*
    Mediator Interface
 */
public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
