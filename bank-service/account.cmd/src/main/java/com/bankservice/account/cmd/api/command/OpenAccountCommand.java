package com.bankservice.account.cmd.api.command;

import com.bankservice.account.common.dto.AccountType;
import com.bankservice.cqrs.core.commands.BaseCommand;
import lombok.Data;


@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private Double openingBalance;
}
