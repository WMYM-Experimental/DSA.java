package com.dsa.data_structs.doubly_circular_linked_list;

import com.dsa.data_structs.circular_linked_list.CllNode;

public class DoublyCircularLinkedList {
    DcllNode head;

    public DoublyCircularLinkedList(int data) {
        this.head = new DcllNode(data);
        this.head.prev = this.head;
        this.head.next = this.head;
    }

    public DoublyCircularLinkedList() {
        this.head = null;
    }

    public boolean isEmpty(){
        return this.head == null || this.size() == 0;
    }

    public int size(){
        if(this.head == null){
            return 0;
        }
        int l = 0;
        DcllNode aux = this.head;
        do {
            aux = aux.next;
            l++;
        }while (aux != this.head);
        return l;
    }

    public void addEnd(int data){
        DcllNode newNode = new DcllNode(data);
        if(this.head == null){
            this.head = newNode;
            this.head.prev = newNode;
            this.head.next = newNode;
        }

        DcllNode aux = this.head;
        do {
            aux = aux.next;
        }while (aux.next != this.head);
        newNode.prev = aux;
        aux.next = newNode;
        this.head.prev = newNode;
        newNode.next = this.head;
    }

    public void addFirst(int data){
        DcllNode newNode = new DcllNode(data);

        this.head.prev.next = newNode;
        newNode.prev = this.head.prev;
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        DcllNode aux = this.head;

        if(this.isEmpty()){
            return "[]";
        }

        do {
            if(aux.next == this.head) {
                result.append(aux.data);
            }else {
                result.append(aux.data).append(", ");
            }
            aux = aux.next;
        }while (aux != this.head);

        result.append(" ]");
        return result.toString();
    }

    public String toNodesString() {
        StringBuilder result = new StringBuilder("[ ");
        DcllNode aux = this.head;

        if(this.isEmpty()){
            return "[]";
        }

        do {
            if(aux.next == this.head) {
                result.append(aux.toString());
            }else {
                result.append(aux.toString()).append(", ");
            }
            aux = aux.next;
        }while (aux != this.head);

        result.append(" ]");
        return result.toString();
    }
}

