package com.example.svvok.evolution.models;

import java.util.LinkedList;

/**
 * Created by svvok on 17.02.2016.
 */
public class Stack<T> {
    private LinkedList<T> stack = new LinkedList<>();
    public void push(T obj) {
        stack.addFirst(obj);
    }
    public T pop() {
        return stack.removeFirst();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
