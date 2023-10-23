package com.bankservice.account.query.infrastructure.handlers;

import com.bankservice.account.common.events.AccountClosedEvent;
import com.bankservice.account.common.events.AccountOpenedEvent;
import com.bankservice.account.common.events.FundsDepositedEvent;
import com.bankservice.account.common.events.FundsWithdrawnEvent;

public interface EventHandler {

    void on(AccountOpenedEvent event);
    void on(AccountClosedEvent event);
    void on(FundsDepositedEvent event);
    void on(FundsWithdrawnEvent event);

}
