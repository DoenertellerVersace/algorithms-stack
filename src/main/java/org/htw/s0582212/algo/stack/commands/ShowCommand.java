package org.htw.s0582212.algo.stack.commands;

public class ShowCommand implements ICommand {

    public static final String ALL_STUDENTS = "all students in the stack:\n";
    public static final String NO_STUDENTS = "no students in the stack!\n";

    @Override
    public void execute(String[] args) {
        if (!stack.isEmpty()) {
            console.write(ALL_STUDENTS);
            stack.print();
        } else {
            console.write(NO_STUDENTS);
        }
    }

}
