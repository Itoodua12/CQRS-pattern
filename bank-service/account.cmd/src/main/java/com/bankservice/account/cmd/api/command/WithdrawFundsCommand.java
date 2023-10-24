package com.bankservice.account.cmd.api.command;

import com.bankservice.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class WithdrawFundsCommand extends BaseCommand {
    private Double amount;
}
