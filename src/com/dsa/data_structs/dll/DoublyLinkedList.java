package com.dsa.data_structs.dll;

public class DoublyLinkedList {
    public DLL_Node head;

    public DoublyLinkedList(int data){
        this.head = new DLL_Node(data);
    }

    public void add(int index, int data){
    }

    public void addFirst(int data){
    }

    public void addEnd(int data){
    }

    public void clear() {
        this.head = null;
    }

    public boolean contains(int data){
        return false;
    }

    public int indexOf(int data){
        return 0;
    }

    public int peek(){
        return this.head.data;
    }

    public int peekLast(){
        return 0;
    }

    public int poll(){
        return 0;
    }

    public int pollLast(){
        return 0;
    }

    public void remove(int index){
    }

    public int size(){
        return 0;
    }

    public void reverseIterative(){
    }

    public DLL_Node reverseRecursive(DLL_Node node){
        return this.head;
    }

    public boolean isEmpty(){
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
