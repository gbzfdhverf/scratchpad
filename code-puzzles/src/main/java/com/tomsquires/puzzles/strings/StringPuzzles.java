package com.tomsquires.puzzles.strings;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class StringPuzzles {
    public boolean isPermutation(String stringOne, String stringTwo) {
        int sumFirst = 0;
        int sumSecond = 0;

        if (StringUtils.isBlank(stringOne) || StringUtils.isBlank(stringTwo) || stringOne.length() != stringTwo.length()) {
            return false;
        }

        for (int i = 0; i < stringOne.length(); ++i) {
            sumFirst += Character.getNumericValue(stringOne.charAt(i));
            sumSecond += Character.getNumericValue(stringTwo.charAt(i));
        }

        return sumFirst == sumSecond;
    }

    public boolean isOnlyUniqueChars(String stringToTest) {
        if (StringUtils.isBlank(stringToTest)) {
            return false;
        }

        Set<Character> seenChars = new HashSet<Character>();

        for (int i = 0; i < stringToTest.length(); ++i) {
            if (seenChars.contains(stringToTest.charAt(i))) {
                return false;
            }
            seenChars.add(stringToTest.charAt(i));
        }

        return true;
    }

    public boolean isOnlyUniqueCharsNoExtraDataStructures(String stringToTest) {
        if (StringUtils.isBlank(stringToTest)) {
            return false;
        }

        for (int i = 0; i < stringToTest.length(); ++i) {
            Character current = stringToTest.charAt(i);
            for (int j = i + 1; j < stringToTest.length(); ++j) {
                if (current.equals(stringToTest.charAt(j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
