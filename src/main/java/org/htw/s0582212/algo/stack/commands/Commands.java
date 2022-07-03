package org.htw.s0582212.algo.stack.commands;

import java.util.Locale;

import static org.htw.s0582212.algo.stack.commands.Commands.Command.HELP;

public class Commands {
    enum Command {
        EXIT(new ExitProgramCommand()),
        POP(new PopCommand()),
        PEEK(new PeekCommand()),
        PUSH(new PushCommand()),
        CLEAR(new ClearCommand()),
        SHOW(new ShowCommand()),
        EMPTY(new EmptyCommand()),
        SIZE(new SizeCommand()),
        HELP(new HelpCommand());

        final ICommand command;

        Command(ICommand command) {
            this.command = command;
        }
    }

    public static void parseAndExecuteCommand(String input) {
        String[] args = input.strip().split(" ", 2);
        ICommand command;
        try {
            command = Command.valueOf(args[0].strip().toUpperCase(Locale.ROOT)).command;
        } catch (IllegalArgumentException ignored) {
            command = HELP.command;
        }
        command.execute(args.length == 1 ? new String[0] : args[1].split(","));
    }
}
