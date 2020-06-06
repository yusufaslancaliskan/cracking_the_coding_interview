package com.cosef.ctci.arrayandstrings;


public class IQ1 {

    public static boolean solution(String s) {
        boolean[] bitArray = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i);
            if (bitArray[position]) {
                return true;
            } else {
                bitArray[position] = true;
            }
        }
        return false;
    }


}
