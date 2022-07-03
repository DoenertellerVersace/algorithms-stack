package org.htw.s0582212.algo.stack.commands;

import org.htw.s0582212.algo.stack.console.StackConsole;

public class ExitProgramCommand implements ICommand {

    public static final String EXIT = "Exit by user choice... Bye!\n";

    @Override
    public void execute(String[] args) {
        ((StackConsole) console).writeOut();
        console.write(EXIT);
        System.exit(0);
    }
}
