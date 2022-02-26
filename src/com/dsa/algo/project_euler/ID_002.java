// Even Fibonacci numbers
/*
Problem 2
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

*/

package com.dsa.algo.project_euler;

import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class ID_002 {

    public HashMap<Integer, Integer> memory = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fibo(100));
    }
    public static int fibo(int n){
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 1;
        }else{
            return fibo(n - 1)+fibo(n - 2);
        }
    }

    public static int fiboDP(int n, HashMap memory){
        // memory.put(1,1);
        if(memory.containsKey(n)){
            int fib = parseInt(String.valueOf(memory.get(n)));
            return fib;
        }
        int currentFibo = fiboDP(n-1, memory) + fiboDP(n-2, memory);
        return 0;
    }

}
