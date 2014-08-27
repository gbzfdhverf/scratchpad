package com.tomsquires.puzzles.trees;

public class Node<T> {
    T data;
    Node leftChild;
    Node rightChild;

    public Node(T data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
