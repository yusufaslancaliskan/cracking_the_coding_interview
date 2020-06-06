package com.cosef.ctci.arrayandstrings;

public class IQ3 {

    public static char[] solution(String s, int length) {
        char[] url = new char[s.length()];
        int move = s.length() - length;

        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                url[i + move] = s.charAt(i);
            }
            if (s.charAt(i) == ' ') {
                url[i + move - 2] = '%';
                url[i + move - 1] = '2';
                url[i + move] = '0';
                move -= 2;
            }
        }

        return url;
    }

}
