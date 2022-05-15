package com.dsa.data_structs.binary_search_tree;

public class BstNode {
    public int data;
    public BstNode left;
    public BstNode right;

    public BstNode(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public BstNode(int data){
        this.data = data;
        this.right =  null;
        this.left = null;
    }

    public boolean isLeaf(){
        return this.right == null && this.left == null;
    }

    @Override
    public String toString() {
        return "(" +
                "Left: " + this.left +
                ", Data: " + this.data +
                ", Right: " + this.right +
                ")";
    }
}
