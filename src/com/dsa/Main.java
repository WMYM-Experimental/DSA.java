package com.dsa;

import com.dsa.data_structs.queue_sll.Queue_SLL;
import com.dsa.data_structs.stack_sll.Stack_SLL;

public class Main {
    public static void main(String[] args) {
        Stack_SLL stk = new Stack_SLL(1000);
        Queue_SLL queue = new Queue_SLL(2000);
        for (int i = 0; i < 10; i++) {
            stk.push(i);
            queue.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("STACK");
            System.out.println(stk.toString());
            stk.pop();
            System.out.println("QUEUE");
            System.out.println(queue.toString());
            queue.poll();
        }
    }
}
