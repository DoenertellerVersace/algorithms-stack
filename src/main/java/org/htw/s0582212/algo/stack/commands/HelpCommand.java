package org.htw.s0582212.algo.stack.commands;

import static org.htw.s0582212.algo.stack.console.ConsoleMenu.HELP_MESSAGE;

public class HelpCommand implements ICommand {
    @Override
    public void execute() {
        console.write(HELP_MESSAGE);
    }
}
