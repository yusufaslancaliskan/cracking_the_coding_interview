package com.cosef.ctci.arrayandstrings;

public class IQ5 {

    public static boolean solution(String actual, String edited) {
        int[] bitArray = new int[256];
        int changes = 0;

        for (int i = 0; i < actual.length(); i++) {
            int position = actual.charAt(i);
            bitArray[position] = ++bitArray[position];
        }

        for (int i = 0; i < edited.length(); i++) {
            int position = edited.charAt(i);
            bitArray[position] = --bitArray[position];
        }
        for (int i = 0; i < 256; i++) {
            changes += Math.abs(bitArray[i]);
        }

        return changes <= 2;
    }

}
