package com.dsa.data_structs.b_tree;

public class BinarySearchTree {
    public BST_Node root;

    public BinarySearchTree(int rootValue){
        this.root = new BST_Node(rootValue);
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BST_Node insert(BST_Node current, int data){
        if (this.root == null) {
            this.root = new BST_Node(data);
            return this.root;
        }

        if (data < current.data) {
            if(current.left != null){
                current.left = insert(current.left, data);
            }
            current.right = new BST_Node(data);
            return current.right;
        } else if (data > current.data) {
            if(current.right != null){
                insert(current.right, data);
            }
            current.right = new BST_Node(data);
            return current.right;
        } else {
            return current;
        }
    }

    public boolean contains(BST_Node node, int value){
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
