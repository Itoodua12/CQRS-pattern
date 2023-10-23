package com.bankservice.account.common.events;

import com.bankservice.cqrs.core.events.BaseEvent;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public class AccountClosedEvent extends BaseEvent {
}
