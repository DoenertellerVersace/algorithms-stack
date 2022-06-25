package org.htw.s0582212.algo.stack.commands;

public class ClearCommand implements ICommand {

    public static final String ALREADY_EMPTY = "stack was already empty!\n";
    public static final String EMPTIED = "emptied the stack!\n";

    @Override
    public void execute() {
        if (stack.isEmpty()) {
            console.write(ALREADY_EMPTY);
        } else {
            stack.clear();
            console.write(EMPTIED);
        }
    }

}
