package org.htw.s0582212.algo.stack.commands;

import org.htw.s0582212.algo.stack.model.Student;

public class PopCommand implements ICommand {

    public static final String NO_STUDENT = "no student to pop!\n";

    @Override
    public void execute() {
        Student student = stack.pop();
        console.write(student == null ? NO_STUDENT : student + "\n");
    }
}
