package com.dsa.data_structs.b_tree;

public class BinarySearchTree {
    public BstNode root;

    public BinarySearchTree(int rootValue){
        this.root = new BstNode(rootValue);
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BstNode getRoot() {
        return root;
    }

    public void insert(BstNode current, int data){
        if (this.root == null) {
            this.root = new BstNode(data);
            return;
        }
        if (data < current.data) {
            if(current.left != null){
                insert(current.left, data);
            }else{
                current.left = new BstNode(data);
            }
        } else {
            if(current.right != null){
                insert(current.right, data);
            }else{
                current.right = new BstNode(data);
            }
        }
    }

    public boolean contains(BstNode node, int value){
        if (node == null) {
            return false;
        }
        if (value == node.data) {
            return true;
        }
        return value < node.data
                ? contains(node.left, value)
                : contains(node.right, value);
    }
}
