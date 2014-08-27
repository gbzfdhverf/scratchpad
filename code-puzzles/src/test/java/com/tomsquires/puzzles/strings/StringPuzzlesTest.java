package com.tomsquires.puzzles.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringPuzzlesTest {
    private StringPuzzles stringPuzzles;

    @Before
    public void setUp() {
        stringPuzzles = new StringPuzzles();
    }

    @Test
    public void testPermutations() {
        Assert.assertTrue(stringPuzzles.isPermutation("abcde", "abcde"));
        Assert.assertTrue(stringPuzzles.isPermutation("abcde", "bedac"));
        Assert.assertFalse(stringPuzzles.isPermutation("abcde", "fghij"));
        Assert.assertFalse(stringPuzzles.isPermutation("abcde", "abcdee"));
        Assert.assertFalse(stringPuzzles.isPermutation("", ""));
        Assert.assertFalse(stringPuzzles.isPermutation("", null));
        Assert.assertFalse(stringPuzzles.isPermutation(null, ""));
        Assert.assertFalse(stringPuzzles.isPermutation(null, null));
    }

    @Test
    public void testOnlyUniqueChars() {
        Assert.assertTrue(stringPuzzles.isOnlyUniqueChars("abcdef"));
        Assert.assertFalse(stringPuzzles.isOnlyUniqueChars("abcdeff"));
        Assert.assertFalse(stringPuzzles.isOnlyUniqueChars(""));
        Assert.assertFalse(stringPuzzles.isOnlyUniqueChars(null));

        Assert.assertTrue(stringPuzzles.isOnlyUniqueCharsNoExtraDataStructures("abcdef"));
        Assert.assertFalse(stringPuzzles.isOnlyUniqueCharsNoExtraDataStructures("abcdeff"));
        Assert.assertFalse(stringPuzzles.isOnlyUniqueCharsNoExtraDataStructures(""));
        Assert.assertFalse(stringPuzzles.isOnlyUniqueCharsNoExtraDataStructures(null));
    }

    @Test
    public void testCompressionAlgorithm() {
        Assert.assertEquals("a2b1c5a3", stringPuzzles.compressString("aabcccccaaa"));
        Assert.assertEquals("abcdefg", stringPuzzles.compressString("abcdefg"));
        Assert.assertEquals("", stringPuzzles.compressString(""));
        Assert.assertEquals("", stringPuzzles.compressString(null));
    }
}
