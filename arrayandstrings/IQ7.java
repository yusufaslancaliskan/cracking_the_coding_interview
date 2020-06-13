package com.cosef.ctci.arrayandstrings;

public class IQ7 {

    public static int[][] solution(int[][] image, int length) {
        int[][] rotatedImage = new int[length][length];

        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                rotatedImage[length - y - 1][x] = image[x][y];
            }
        }

        return rotatedImage;
    }

}
