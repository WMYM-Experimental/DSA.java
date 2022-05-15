package com.dsa;

import com.dsa.data_structs.binary_search_tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
        for (int i = 0; i < 10; i++) {
            btree.insert(btree.getRoot(), i);
        }
        btree.traversePreOrder(btree.getRoot());
        System.out.println("\n");
        btree.traverseInOrder(btree.getRoot());
        System.out.println("\n");
        btree.traversePostOrder(btree.getRoot());
    }
}
