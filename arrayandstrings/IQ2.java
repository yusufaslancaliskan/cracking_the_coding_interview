package com.cosef.ctci.arrayandstrings;

public class IQ2 {

    public static boolean solution(String one, String another) {

        int overAll = 0;

        if (one.length() != another.length())
            return false;

        for (int i = 0; i < one.length(); i++) {
            overAll = overAll + (one.charAt(i) - another.charAt(i));
        }
        return overAll == 0;
    }


}
