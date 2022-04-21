package com.dsa.algo.array;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        System.out.println("*******The Arrays*******");
        // index starts form (0)
        // need the type and size
        int[] numbers = new int[5];
        String[] colors = new String[5];
        // array elements
        numbers[0] = 100;
        numbers[1] = 1000;
        colors[2] = "blue";
        colors[3] = "red";
        // print an Array
        System.out.println("*******This does not print*******");
        System.out.println(numbers);
        System.out.println(colors);
        // dont do this it only prints "memory dir"
        //instead do this
        System.out.println("*******Print*******");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(colors));

        // to handle with elements use name[]
        System.out.println(colors[2] + "and" + colors[3]);

        // for loop - same on while or do while
        System.out.println("*******Read*******");
        System.out.println("*******for*******");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }

        //foreach
        System.out.println("*******for enhanced/each*******");
        for (String s : colors) {
            System.out.println(s);
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        //streams
        System.out.println("*******Streams/foreach*******");
        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(colors).forEach(System.out::println);

        //read on reverse always substract 1 to teh lengt
        System.out.println("*******Read on Reverse*******");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
