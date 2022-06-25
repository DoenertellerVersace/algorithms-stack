package org.htw.s0582212.algo.stack.commands;

public class ExitProgramCommand implements ICommand {

    public static final String EXIT = "Exit by user choice... Bye!\n";

    @Override
    public void execute() {
        console.write(EXIT);
        System.exit(0);
    }
}
