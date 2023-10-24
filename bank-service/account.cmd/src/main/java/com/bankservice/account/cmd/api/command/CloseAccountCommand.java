package com.bankservice.account.cmd.api.command;

import com.bankservice.cqrs.core.commands.BaseCommand;
import lombok.Data;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
