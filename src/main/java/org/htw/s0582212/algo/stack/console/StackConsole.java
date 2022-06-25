package org.htw.s0582212.algo.stack.console;

import org.htw.s0582212.algo.stack.model.Student;
import org.htw.s0582212.algo.stack.util.Stack;

import java.util.Scanner;

public class StackConsole implements IConsole {

    private static final Stack<Student> stack = new Stack<>();
    private static final StackConsole _instance = new StackConsole();

    public static IConsole getInstance() {
        return _instance;
    }

    public static Stack<Student> getStack() {
        return stack;
    }

    static final String ERROR_MSG = "Not a valid option, try again";
    final Scanner scanner = new Scanner(System.in);

    @Override
    public void write(String s) {
        System.out.print(s);
    }

    @Override
    public Integer readInteger(String prompt) {
        while (true) {
            write(prompt);
            if (scanner.hasNext()) {
                String in = scanner.next().trim();
                try {
                    return Integer.parseInt(in);
                } catch (NumberFormatException ignored) {
                    write(ERROR_MSG);
                }
            }
        }
    }

    @Override
    public String readString(String prompt) {
        String s = "";
        write(prompt);
        if (scanner.hasNext()) {
            s += scanner.nextLine().trim();
            if (s.equals("")) {
                s += scanner.nextLine().trim();
            }
            return s;
        }
        return "";
    }
}
