package com.dsa.data_structs.b_tree;

public class BST_Node {
    int data;
    BST_Node left;
    BST_Node right;

    public BST_Node(int data){
        this.data = data;
        this.right =  null;
        this.left = null;
    }
}
