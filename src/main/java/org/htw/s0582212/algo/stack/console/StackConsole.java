package org.htw.s0582212.algo.stack.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.htw.s0582212.algo.stack.model.Student;
import org.htw.s0582212.algo.stack.util.Stack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StackConsole implements IConsole {

    private static final Stack<Student> stack = new Stack<>();
    private static final StackConsole _instance = new StackConsole();
    private static final Scanner scanner = new Scanner(System.in);
    private static final ObjectMapper oma = new ObjectMapper();
    private static final StringBuilder sb = new StringBuilder("[");
    private static final String ERROR_MSG = "Not a valid option, try again";
    public static final String STUDENTS_JSON = "./src/main/resources/students.json";

    public static IConsole getInstance() {
        return _instance;
    }

    public static Stack<Student> getStack() {
        return stack;
    }

    static {
        try {
            Student[] students = oma.readValue(new File(STUDENTS_JSON), Student[].class);
            for (Student student : students) {
                stack.push(student);
                sb.append(oma.writeValueAsString(student)).append(",");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addStudent(Student student) {
        try {
            sb.append(oma.writeValueAsString(student)).append(",");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeLast(Student student) {
        try {
            sb.delete(sb.length() - oma.writeValueAsString(student).length(), sb.length());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeOut() {
        if (sb.toString().endsWith("{")) {
            sb.setLength(sb.length() - 1);
        }
        if (sb.toString().endsWith(",")) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        try {
            Files.writeString(Path.of(STUDENTS_JSON), sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void clearWriteOut() {
        sb.setLength(0);
        sb.append("[");
    }

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
