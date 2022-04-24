package com.dsa;

import com.dsa.data_structs.b_tree.BinarySearchTree;
import com.dsa.data_structs.dll.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
        for (int i = 0; i < 10; i++) {
            btree.insert(btree.root,i);
        }
        if(btree.contains(btree.root, 5)){
            System.out.println("Is in btree");
        }
    }
}
