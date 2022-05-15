package com.dsa.data_structs.circular_linked_list;

public class CircularLinkedList {
    public CllNode head;

    public CircularLinkedList(){
        this.head = null;
    }

    public CircularLinkedList(int data){
        this.head = new CllNode(data);
        this.head.next = this.head;
    }

    public void addEnd(int data){
        CllNode newNode = new CllNode(data);
        CllNode aux = this.head;

        if(this.head == null){
            this.head = newNode;
            this.head.next = this.head;
            return;
        }

        do {
            aux = aux.next;
        }while(aux.next != this.head);

        newNode.next = aux.next;
        aux.next = newNode;
    }

    public void addAt(int nth, int data){
        CllNode aux = this.head;
        CllNode newNode = new CllNode(data);

        if((nth > this.size() - 1) || (nth < 0)){
            System.out.println("List IndexOutOfBoundsException");
            System.exit(-1);
        }

        if(nth == 0){
            CllNode temp = this.head;
            do {
                temp = temp.next;
            }while(temp.next != this.head);

            temp.next = newNode;
            newNode.next = this.head;
            this.head = newNode;
            return;
        }

        for (int i = 0; i < nth - 1 ; i++) {
            aux = aux.next;
        }

        newNode.next = aux.next.next;
        aux.next = newNode;
    }

    public boolean removeData(int data){
        CllNode aux = this.head;

        if(this.head == null){
            return false;
        }

        // this is case when the data we want to remove is the head
        if(this.head.data == data){
            CllNode temp = this.head;
            do {
                temp = temp.next;
            }while(temp.next != this.head);
            this.head = this.head.next;
            temp.next = this.head;
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

    public int size(){
        CllNode aux = this.head;
        if(this.head == null){
            return 0;
        }
        int l = 0;
        do {
            l++;
            aux = aux.next;
        }while(aux != this.head);
        return l;
    }

    public int getIndex(int data){
        CllNode aux = this.head;
        int index = 0;
        do {
            if(aux.data == data){
                return index;
            }
            index++;
            aux = aux.next;
        }while(aux != this.head);
        return -1;
    }

    public boolean removeAt(int nth){
        CllNode aux = this.head;

        if(this.head == null){
            return false;
        }

        if((nth > this.size() - 1) || (nth < 0)){
            System.out.println("List IndexOutOfBoundsException");
            System.exit(-1);
            return false;
        }

        // this is case when the data we want to remove is the head
        if(nth == 0){
            CllNode temp = this.head;
            do {
                temp = temp.next;
            }while(temp.next != this.head);
            this.head = this.head.next;
            temp.next = this.head;
            return true;
        }

        for (int i = 0; i < nth -1; i++) {
            aux = aux.next;
        }
        aux.next = aux.next.next;
        return false;
    }

    public boolean isEmpty(){
        return this.size() <= 0 || this.head == null;
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
