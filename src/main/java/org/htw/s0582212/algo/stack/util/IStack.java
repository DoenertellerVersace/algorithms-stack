package org.htw.s0582212.algo.stack.util;

public interface IStack<T> {
    T pop();
    T peek();
    void push(T t);
    void clear();
    boolean isEmpty();
    int size();
    void print();
}
