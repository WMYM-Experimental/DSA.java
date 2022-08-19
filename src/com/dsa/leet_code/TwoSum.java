// Two Sum

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
package com.dsa.leet_code;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(compute(new int[]{1, 2, 3, 4, 5, 9, 10, 20, 19}, 20)));
    }

    public static int[] compute(int[] arr, int sum){
        int[] sol = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j] == sum){
                    sol[0] = i;
                    sol[1] = j;
                    return sol;
                }
            }
        }
        return sol;

    }
}
