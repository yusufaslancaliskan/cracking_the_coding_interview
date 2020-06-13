package com.cosef.ctci;

import com.cosef.ctci.arrayandstrings.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println(IQ1.solution("hello"));
//        System.out.println(IQ2.solution("hello", "ehllo"));
//        System.out.println(IQ3.solution("Mr Yusuf Aslan Çalýþkan      ", 23));
//        System.out.println(IQ4.solution("Murder for a jar of red rum".toLowerCase()));
//        System.out.println(IQ5.solution("apple","aple"));
//        System.out.println(IQ6.solution("ababbbcccccaaa"));
        int mat[][] = { { 1, 0, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

//        int mat[][] = { { 1, 0},
//                {3,4}};
//        System.out.println(IQ7.solution(mat,2));
        System.out.println(IQ8.solution(mat,4,4));

    }
}
