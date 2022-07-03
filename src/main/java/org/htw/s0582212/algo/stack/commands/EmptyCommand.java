package org.htw.s0582212.algo.stack.commands;

public class EmptyCommand implements ICommand {
    @Override
    public void execute(String[] args) {
        console.write("stack is" + (stack.isEmpty() ? "" : " not") + " empty!\n");
    }
}
