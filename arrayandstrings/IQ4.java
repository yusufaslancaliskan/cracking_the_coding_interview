package com.cosef.ctci.arrayandstrings;

public class IQ4 {

    public static boolean solution(String s) {
        int[] bitArray = new int[256];
        int uniques = 0;
        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i);
            if (s.charAt(i) != ' ') {
                if (bitArray[position] % 2 == 1) {
                    bitArray[position] = 0;
                    uniques--;
                } else {
                    bitArray[position] = 1;
                    uniques++;
                }
            }
        }
        return uniques == 1;
    }

}
