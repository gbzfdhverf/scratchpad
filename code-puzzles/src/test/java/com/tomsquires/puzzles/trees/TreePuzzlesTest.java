package com.tomsquires.puzzles.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TreePuzzlesTest {
    private Node<Integer> rootNode;
    private TreePuzzles<Integer> treePuzzles;

    @Before
    public void setUp() {
        rootNode = createTree();
        treePuzzles = new TreePuzzles<Integer>();
    }
    @Test
    public void testInOrder() {
        treePuzzles.inOrder(rootNode);
        Assert.assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10), treePuzzles.getElementsVisited());
    }

    @Test
    public void testPreOrder() {
        treePuzzles.preOrder(rootNode);
        Assert.assertEquals(Arrays.asList(7, 1, 0, 3, 2, 5, 4, 6, 9, 8, 10), treePuzzles.getElementsVisited());
    }

    @Test
    public void testPostOrder() {
        treePuzzles.postOrder(rootNode);
        Assert.assertEquals(Arrays.asList(0, 2, 4, 6, 5, 3, 1, 8, 10, 9, 7), treePuzzles.getElementsVisited());
    }

    @Test
    public void testBreadthFirst() {
        treePuzzles.breadthFirst(rootNode);
        Assert.assertEquals(Arrays.asList(7, 1, 9, 0, 3, 8, 10, 2, 5, 4, 6), treePuzzles.getElementsVisited());
    }

    @Test
    public void testDepth() {
        Assert.assertEquals(5, treePuzzles.depth(rootNode));
    }

    @Test
    public void testNodeCount() {
        Assert.assertEquals(11, treePuzzles.nodeCount(rootNode));
    }

    private Node<Integer> createTree() {
        Node<Integer> six = new Node<Integer>(6, null, null);
        Node<Integer> four = new Node<Integer>(4, null, null);
        Node<Integer> five = new Node<Integer>(5, four, six);
        Node<Integer> two = new Node<Integer>(2, null, null);
        Node<Integer> three = new Node<Integer>(3, two, five);
        Node<Integer> eight = new Node<Integer>(8, null, null);
        Node<Integer> ten = new Node<Integer>(10, null, null);
        Node<Integer> nine = new Node<Integer>(9, eight, ten);
        Node<Integer> zero = new Node<Integer>(0, null, null);
        Node<Integer> one = new Node<Integer>(1, zero, three);
        Node<Integer> root = new Node<Integer>(7, one, nine);
        return root;
    }
}
