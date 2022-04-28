package com.dsa.data_structs.b_tree;

public class BST_Node {
    public int data;
    public BST_Node left;
    public BST_Node right;

    public BST_Node(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public BST_Node(int data){
        this.data = data;
        this.right =  null;
        this.left = null;
    }
}
