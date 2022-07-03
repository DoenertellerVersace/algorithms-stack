package org.htw.s0582212.algo.stack.console;

import org.htw.s0582212.algo.stack.commands.Commands;

public class ConsoleMenu {
    public static final String PROMPT = "$ ";
    static final String GREETING = """
            Console-Application: Student-Stack                  Jakob Hadulla s0582212
            """;
    public static final String HELP_MESSAGE = """
            commands:
                - peek   -> will show the most recent item and put it back
                - pop   -> will take the most recent item from the stack and return it
                - push   -> will prompt user to fill in an item and put it on the stack
                - show   -> will print out the stack
                - empty   -> will reveal if the stack is empty
                - size   -> will show the size of the stack
                - clear   -> will empty the stack
                - help   -> will print out this page
                - exit
            """;

    public static void run(IConsole console) {
        console.write(GREETING + HELP_MESSAGE);
        while (true) {
            Commands.parseAndExecuteCommand(console.readString(PROMPT));
        }
    }
}
