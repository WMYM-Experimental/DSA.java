package com.dsa.array.array_algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,12,12,3,4,5,1,3,4,5,3113,1,1};
        int[] result = sumOfTwoReturned(arr, 13);
        System.out.println(Arrays.toString(result));
        System.out.println(fibo(10));
        System.out.println(fiboDP(20));
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

    public static int fibo(int num){
        if (num == 0){
            return  0;
        }else if(num == 1){
            return 1;
        }else{
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static int fiboDP(int num){
        HashMap<Integer, Integer> memory = new HashMap<Integer, Integer>();
        memory.put(0, 0);
        memory.put(1, 1);
        for(int i = 2; i <= num; i++) {
            memory.put(i, memory.get(i - 1) + memory.get(i - 2));
        }
        return memory.get(num);
    }
}
