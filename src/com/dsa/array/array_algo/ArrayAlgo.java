package com.dsa.array.array_algo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,12,12,3,4,5,1,3,4,5,3113,1,1};
        int[] result = sumOfTwoReturned(arr, 13);
        System.out.println(Arrays.toString(result));
    }

    public static boolean sumOfTwo(int[] arr, int value) {
        //Given an unsorted integer array, return true if there is a pair with the given sum as result.
        for (int i = 0; i <= arr.length; i++) {
            int diff = value - i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == diff) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] sumOfTwoReturned(int[] arr, int value) {
        //Given an unsorted integer array, find a pair with the given sum in it.
        int[] pair = new int[2];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    pair = new int[]{arr[i], arr[j]};
                    System.out.println("Pair found: " + Arrays.toString(pair));
                }
            }
        }
        return pair;
    }
}
