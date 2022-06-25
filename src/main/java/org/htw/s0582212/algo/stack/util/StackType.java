package org.htw.s0582212.algo.stack.util;

public interface StackType<T> {
    T pop();
    T peak();
    void push(T t);
    void clear();
    boolean isEmpty();
    int size();
    void print();
}
