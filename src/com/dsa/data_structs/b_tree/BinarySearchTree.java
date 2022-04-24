package com.dsa.data_structs.b_tree;

public class BinarySearchTree {
    public BST_Node root;

    public BinarySearchTree(int rootValue){
        this.root = new BST_Node(rootValue);
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BST_Node insert(BST_Node rootNode, int data){
        if (rootNode == null) {
            rootNode = new BST_Node(data);
        }
        else if (data <= rootNode.data) {
            rootNode.left = insert(rootNode.left, data);
        }
        else {
            rootNode.right = insert(rootNode.right, data);
        }
        return rootNode;
    }

    public boolean contains(BST_Node rootNode, int data){
        if (rootNode == null) {
            return false;
        }
        else if (rootNode.data == data) {
            return true;
        }
        else if(data < rootNode.data) {
            contains(rootNode.left, data);
        }
        else {
            contains(rootNode.right, data);
        }
        return false;
    }
}
