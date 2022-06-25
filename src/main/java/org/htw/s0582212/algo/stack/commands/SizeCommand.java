package org.htw.s0582212.algo.stack.commands;

public class SizeCommand implements ICommand {

    public static final String NUMBER_LINE = "number of students in the stack: ";

    @Override
    public void execute() {
        console.write(NUMBER_LINE + stack.size() + "\n");
    }

}
