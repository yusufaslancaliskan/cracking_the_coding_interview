package com.cosef.ctci.recursiveandynamic;

public class RD1 {

    public static int solution(int n, int[] memo) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        memo[n] = solution(n - 1,memo) + solution(n - 2,memo) + solution(n - 3,memo);
        return memo[n];
    }

}
