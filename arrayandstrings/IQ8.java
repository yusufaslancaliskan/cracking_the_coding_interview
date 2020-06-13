package com.cosef.ctci.arrayandstrings;

public class IQ8 {

    public static int[][] solution(int[][] matrix, int xLength, int yLength) {
        boolean zeroMatrix = false;
        int[] zeroX = new int[xLength];
        int[] zeroY = new int[yLength];

        for (int j = 0; j < xLength; j++) {
            zeroX[j] = -1;
        }

        for (int j = 0; j < yLength; j++) {
            zeroY[j] = -1;
        }

        int index = 0;
        for (int x = 0; x < xLength; x++) {
            for (int y = 0; y < yLength; y++) {
                if (matrix[x][y] == 0 && !zeroMatrix) {
                    zeroMatrix = true;
                    zeroX[index] = x;
                    zeroY[index] = y;
                    index++;
                }
            }
            zeroMatrix = false;
        }

        for (int i = 0; i < yLength; i++) {
            if (zeroX[i] != -1) {
                for (int j = 0; j < xLength; j++) {
                    matrix[zeroX[i]][j] = 0;
                }
            }
        }

        for (int i = 0; i < xLength; i++) {
            if (zeroY[i] != -1) {
                for (int j = 0; j < xLength; j++) {
                    matrix[j][zeroY[i]] = 0;
                }
            }
        }

        return matrix;
    }

}
