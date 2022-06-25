package org.htw.s0582212.algo.stack.util;

import org.htw.s0582212.algo.stack.console.StackConsole;

public class Stack<T> implements StackType<T> {

    private Element top = null;

    @Override
    public T pop() {
        Element temp = top;
        top = temp == null ? null : temp.next == null ? null : temp.next;
        return temp == null ? null : temp.element;
    }

    @Override
    public T peek() {
        return top == null ? null : top.element;
    }

    @Override
    public void push(T t) {
        Element temp = top;
        top = new Element();
        top.element = t;
        top.next = temp;
    }

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        Element temp = top;
        int n = 0;
        while (top != null) {
            pop();
            n++;
        }
        top = temp;
        return n;
    }

    @Override
    public void print() {
        Element temp = top;
        while (top != null) {
            StackConsole.getInstance().write(" - " + pop() + "\n");
        }
        top = temp;
    }

    class Element {
        T element;
        Element next;
    }
}
