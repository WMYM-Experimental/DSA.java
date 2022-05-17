package com.dsa;

import com.dsa.data_structs.binary_search_tree.BinarySearchTree;
import com.dsa.data_structs.doubly_circular_linked_list.DoublyCircularLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList(100);
        for (int i = 0; i < 10; i++) {
            dcll.addEnd(i);
        }
        System.out.println(dcll.toNodesString());
    }
}
