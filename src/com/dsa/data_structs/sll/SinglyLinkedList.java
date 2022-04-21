package com.dsa.data_structs.sll;

import java.util.Collection;

public class SinglyLinkedList {
    SLL_Node head = null;

    public SinglyLinkedList(int data){
        this.head = new SLL_Node(data);
    }

    public SLL_Node getHead() {
        return head;
    }

    public void setHead(SLL_Node head) {
        this.head = head;
    }

    public void add(int data){
        SLL_Node newNode = new SLL_Node(data);

        if(this.head == null){
            this.head = newNode;
            return;
        }

        SLL_Node aux = this.head;

        while(!(aux.next == null)){
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

    public boolean clear(){
        return false;
    }

    public SinglyLinkedList clone(){
        return this;
    }

    public void addALL(Collection<Integer> collection){
        return;
    }


}