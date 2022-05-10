package com.dsa.data_structs.cll;

public class CircularLinkedList {
    public CllNode head;
    public CllNode tail;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public CircularLinkedList(int data){
        this.head = new CllNode(data);
        this.head.next = this.head;
        this.tail = this.head.next;
    }

    public void addEnd(int data){
        CllNode aux = new CllNode(data);
        if(this.head == null){
            this.head = aux;
            this.head.next = this.head;
            this.tail = this.head.next;
        }

        aux.next = this.head;
        this.tail.next = aux;
        this.tail = aux;
    }

    public boolean remove(int data){
        CllNode aux = this.head;
        if(this.head == null){
            return false;
        }

        // this is case when the data we want to remove is the head
        if(this.head.data == data){
            this.head = this.head.next;
            this.tail.next = this.head;
            this.tail = this.head;
            return true;
        }

        do {
            if(aux.next.data == data){
                aux.next = aux.next.next;
                return true;
            }
            aux = aux.next;
        }while(aux != this.head);

        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        CllNode aux = this.head;

        if(this.head == null){
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
        CllNode aux = this.head;

        if(this.head == null){
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
