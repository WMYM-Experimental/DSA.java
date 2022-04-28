package com.dsa.data_structs.b_tree;

public class BinarySearchTree {
    public BST_Node root;

    public BinarySearchTree(int rootValue){
        this.root = new BST_Node(rootValue);
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BST_Node insert(BST_Node current, int value){
        if (current == null) {
            return new BST_Node(value);
        }

        if (value < current.data) {
            current.left = insert(current.left, value);
        } else if (value > current.data) {
            current.right = insert(current.right, value);
        } else {
            return current;
        }
        return current;
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
