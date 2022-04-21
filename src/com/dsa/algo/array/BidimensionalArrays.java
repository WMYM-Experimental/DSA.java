package com.dsa.algo.array;

import java.util.Arrays;

public class BidimensionalArrays {
    public static void main(String[] args) {
        // it is basically a matrix
        // kind an array of arrays
        int[][] grid = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(grid));
    }
}
