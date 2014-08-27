package com.tomsquires.puzzles.stacks;

import java.util.Arrays;

public class Stack<T> {
    private T elements[];
    private int pointer;

    public Stack() {
        this.elements = (T[]) new Object[10];
        this.pointer = 0;
    }

    public void push(T element) {
        if (pointer + 1 > elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[pointer++] = element;
    }

    public T pop() {
        T element = elements[pointer - 1];
        elements[--pointer] = null;

        int newElementsArraySize = elements.length / 2;
        if (pointer < newElementsArraySize) {
            elements = Arrays.copyOf(elements, newElementsArraySize);
        }
        return element;
    }

    public int size() {
        return pointer;
    }

    public boolean peek(T element) {
        for (int i = 0; i < pointer; ++i) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
