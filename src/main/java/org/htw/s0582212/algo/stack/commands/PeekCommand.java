package org.htw.s0582212.algo.stack.commands;

import org.htw.s0582212.algo.stack.model.Student;

public class PeekCommand implements ICommand {

    public static final String NO_STUDENT = "no student to peek!\n";

    @Override
    public void execute() {
        Student student = stack.peek();
        console.write(student == null ? NO_STUDENT : student + "\n");
    }
}
