package org.htw.s0582212.algo.stack.commands;

import java.util.Locale;

import static org.htw.s0582212.algo.stack.commands.Commands.Command.HELP;

public class Commands {
    enum Command {
        EXIT(new ExitProgramCommand()),
        POP(new PopCommand()),
        PEEK(new PeakCommand()),
        PUSH(new PushCommand()),
        CLEAR(new ClearCommand()),
        SHOW(new ShowCommand()),
        SIZE(new SizeCommand()),
        HELP(new HelpCommand());

        final ICommand command;

        Command(ICommand command) {
            this.command = command;
        }
    }

    public static ICommand parseCommand(String input) {
        ICommand command;
        try {
            command = Command.valueOf(input.strip().toUpperCase(Locale.ROOT)).command;
        } catch (IllegalArgumentException ignored) {
            command = HELP.command;
        }
        return command;
    }
}
