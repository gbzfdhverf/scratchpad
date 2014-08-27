package com.tomsquires.puzzles.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreePuzzles<T> {
    private List<T> elementsVisited = new LinkedList<T>();
    private Queue<Node<T>> breadthFirstQueue = new LinkedList<Node<T>>();

    public List<T> getElementsVisited() {
        List<T> elementsInOrder =  this.elementsVisited;
        this.elementsVisited = new LinkedList<T>();
        return elementsInOrder;
    }

    public void preOrder(Node<T> tree) {
        if (tree == null) {
            return;
        }

        elementsVisited.add(tree.data);
        preOrder(tree.leftChild);
        preOrder(tree.rightChild);
    }

    public void inOrder(Node<T> tree) {
        if (tree == null) {
            return;
        }

        inOrder(tree.leftChild);
        elementsVisited.add(tree.data);
        inOrder(tree.rightChild);
    }

    public void postOrder(Node<T> tree) {
        if (tree == null) {
            return;
        }

        postOrder(tree.leftChild);
        postOrder(tree.rightChild);
        elementsVisited.add(tree.data);
    }

    public int depth(Node<T> tree) {
        if (tree == null) {
            return 0;
        }
        if (tree.rightChild != null || tree.leftChild != null) {
            return 1 + depth(tree.rightChild) + depth(tree.leftChild);
        }
        return 0;
    }

    public int nodeCount(Node<T> tree) {
        if (tree == null) {
            return 0;
        }
        return 1 + nodeCount(tree.leftChild) + nodeCount(tree.rightChild);
    }

    public void breadthFirst(Node<T> tree) {
        if (tree == null) {
            return;
        }

        breadthFirstQueue.add(tree);
        while (!breadthFirstQueue.isEmpty()) {
            Node<T> node = breadthFirstQueue.remove();
            elementsVisited.add(node.data);
            if (node.leftChild != null) {
                breadthFirstQueue.add(node.leftChild);
            }
            if (node.rightChild != null) {
                breadthFirstQueue.add(node.rightChild);
            }
        }
    }
}
