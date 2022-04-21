package com.dsa.data_structs.sll;

import java.util.Collection;

public class SinglyLinkedList {
    // atributes
    SLL_Node head = null;

    // constructor
    public SinglyLinkedList(int data){
        this.head = new SLL_Node(data);
    }

    // gets and sets
    public SLL_Node getHead() {
        return this.head;
    }

    public void setHead(SLL_Node head) {
        this.head = head;
    }

    // methods
    public void add(int data){
        // append => this adds an element at the end of the sll
        SLL_Node newNode = new SLL_Node(data);

        if(this.head == null){
            this.head = newNode;
            return;
        }

        SLL_Node aux = this.head;

        while(aux.next != null){
            aux = aux.next;
        }
        aux.next = newNode;
    }

    public void add(int nth, int data){
        return;
    }

    public void addFirst(int data){
        return;
    }

    public void addEnd(int data){
        return;
    }

    public void clear() {
        this.head = null;
        return;
    }

    public void addALL(Collection<Integer> collection){
        return;
    }

    public boolean contains(int data){
        SLL_Node aux = this.head;
        while(aux.next != null){
            if(aux.data == data){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    public int getFirst(){
        return this.head.data;
    }

    public int getLast(){
        SLL_Node aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        return aux.data;
    }

    public int indexOf(){
        return -1;
    }

    public int peek(){
        return this.head.data;
    }

    public int peekLast(){
        SLL_Node aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        return aux.data;
    }

    public int poll(){
        int temp = this.head.data;
        SLL_Node aux = this.head;
        this.head = aux.next;
        return temp;
    }

    public int pollLast(){
        SLL_Node aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        int temp = aux.data;
        aux = null;
        return temp;
    }

    public void remove(int nth){
        return;
    }

    public void remove(){
        // this removes the first element of the list
        this.poll();
    }

    public int removeFirst(){
        // this removes the first element of the list
        return this.poll();
    }

    public int removeLast(){
        // this removes the last element of the list
        return this.pollLast();
    }

    public int size(){
        // returns the lenght of the list
        SLL_Node aux = this.head;
        int l = 0;
        while(aux.next != null){
            l++;
            aux = aux.next;
        }
        return l;
    }
}