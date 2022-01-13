package com.dsa.array.array_algo;

public class ArrayAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        boolean result = sumOfTwo(arr, 6);
        System.out.println(result);
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
}
