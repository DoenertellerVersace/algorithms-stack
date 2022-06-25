package org.htw.s0582212.algo.stack;

import org.htw.s0582212.algo.stack.console.StackConsole;
import org.htw.s0582212.algo.stack.console.ConsoleMenu;
import org.htw.s0582212.algo.stack.console.IConsole;

public class App {
    public static void main(String[] args) {
        IConsole console = StackConsole.getInstance();
        ConsoleMenu.run(console);
    }
}
