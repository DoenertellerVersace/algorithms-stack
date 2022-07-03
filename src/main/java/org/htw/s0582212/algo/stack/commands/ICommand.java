package org.htw.s0582212.algo.stack.commands;

import org.htw.s0582212.algo.stack.console.IConsole;
import org.htw.s0582212.algo.stack.console.StackConsole;
import org.htw.s0582212.algo.stack.model.Student;
import org.htw.s0582212.algo.stack.util.Stack;

public interface ICommand {
    IConsole console = StackConsole.getInstance();
    Stack<Student> stack = StackConsole.getStack();

    void execute(String[] args);

}
