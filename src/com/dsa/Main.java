package com.dsa;

import com.dsa.data_structs.b_tree.BinarySearchTree;
import com.dsa.data_structs.cll.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println(cll.toString());
        for (int i = 0; i < 10; i++) {
            cll.addEnd(i);
        }
        System.out.println(cll.toString());
    }
}
