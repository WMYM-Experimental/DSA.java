// Multiples of 3 or 5
/*
Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
package com.dsa.project_euler;

public class ID_001 {
    public static void main(String[] args) {
        System.out.println(MultiplesOf3Or5(1000)); // 233168
    }

    public static int MultiplesOf3Or5(int target){
        int counter = 0;
        for (int i = 0; i < target ; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                counter += i;
            }
        }
        return counter;
    }
}
