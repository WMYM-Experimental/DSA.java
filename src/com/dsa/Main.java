package com.dsa;

import com.dsa.data_structs.dll.DoublyLinkedList;
import com.dsa.data_structs.queue_sll.Queue_SLL;
import com.dsa.data_structs.stack_sll.Stack_SLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1000);
        for (int i = 0; i < 10; i++) {
            dll.addEnd(i);
        }
        System.out.println(dll.toString());
        dll.remove(2);
        dll.reverseIterative();
        System.out.println(dll.toString());
    }
}
