package com.cosef.ctci;

import com.cosef.ctci.recursiveandynamic.RD1;
import com.cosef.ctci.recursiveandynamic.RD2;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0}
        };
        Stack m = new Stack();
        System.out.println(RD2.solution(arr, m, false));
    }
}
