package com.dsa;

import com.dsa.data_structs.sll.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(100);
        for (int i = 0; i < 10; i++) {
            sll.addEnd(i);
        }
        sll.pollLast();
        System.out.println(sll.toString());
        System.out.println(sll.peekLast() + " " + sll.peek());
        System.out.println(sll.size());
        System.out.println(sll.indexOf(8));
        sll.addFirst(900);
        sll.add(3, 245);
        sll.add(4, 245);
        sll.remove(3);
        System.out.println(sll.toString());
    }
}
