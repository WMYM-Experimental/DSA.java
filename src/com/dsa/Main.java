package com.dsa;

import com.dsa.data_structs.b_tree.BinarySearchTree;
import com.dsa.data_structs.cll.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println(cll.toString());
        for (int i = 100; i < 1000; i+=100) {
            cll.addEnd(i);
        }
        System.out.println(cll.toString());
        System.out.println(cll.remove(200));
        System.out.println(cll.toNodesString());
    }
}
