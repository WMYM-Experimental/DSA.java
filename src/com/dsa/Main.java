package com.dsa;

import com.dsa.data_structs.cll.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        for (int i = 0; i < 10; i++) {
            cll.addEnd(i);
        }
        System.out.println(cll.toString());
        cll.addAt(0,100);
        cll.removeAt(1);
        System.out.println(cll.toNodesString());
    }
}
