package org.htw.s0582212.algo.stack.commands;

import org.htw.s0582212.algo.stack.console.StackConsole;
import org.htw.s0582212.algo.stack.model.Student;

public class PopCommand implements ICommand {

    public static final String NO_STUDENT = "no student to pop!\n";

    @Override
    public void execute(String[] args) {
        Student student = stack.pop();
        if (student != null) ((StackConsole) console).removeLast(student);
        console.write(student == null ? NO_STUDENT : student + "\n");
    }
}
