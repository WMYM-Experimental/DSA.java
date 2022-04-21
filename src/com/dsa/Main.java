package com.dsa;

import com.dsa.data_structs.sll.SinglyLinkedList;
import com.dsa.data_structs.stack_sll.Stack_SLL;

public class Main {
    public static void main(String[] args) {
        Stack_SLL stk = new Stack_SLL(1000);
        for (int i = 0; i < 10; i++) {
            stk.push(i);
            System.out.println(stk.peek());
            System.out.println(stk.toString());
        }

        for (int i = 0; i < 10; i++) {
            stk.pop();
            System.out.println(stk.peek());
            System.out.println(stk.toString());
        }
    }
}
