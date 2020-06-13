package com.cosef.ctci.arrayandstrings;

public class IQ6 {

    public static String solution(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < s.length()) {
            sb.append(s.charAt(index));
            int temp = getNextIndex(s, index);
            sb.append(temp + 1 - index);
            index = ++temp;
        }
        return s.length() <= sb.toString().length() ? s : sb.toString();
    }

    private static int getNextIndex(String s, int index) {
        if (s.length() > index + 1 && s.charAt(index) == s.charAt(index + 1)) {
            index = getNextIndex(s, ++index);
        }
        return index;
    }

}
