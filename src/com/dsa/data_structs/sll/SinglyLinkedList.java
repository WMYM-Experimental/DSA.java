package com.dsa.data_structs.sll;

public class SinglyLinkedList {
    // atributes
    public SLL_Node head; // null

    // constructor
    public SinglyLinkedList(int data){
        this.head = new SLL_Node(data);
    }

    // methods
    public void add(int index, int data){
        if(index > this.size() || index < 0){
            System.out.println("SinglyLinked IndexOutOfBoundsException");
            System.exit(-1);
            return;
        }

        if(index == 0){
            this.addFirst(data);
            return;
        }else if(index == this.size() - 1){
            this.addEnd(data);
            return;
        }

        SLL_Node newNode = new SLL_Node(data);
        SLL_Node aux = this.head;

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }

        newNode.next = aux.next;
        aux.next = newNode;
    }

    public void addFirst(int data){
        SLL_Node newNode = new SLL_Node(data);
        if(this.head == null){
            this.head = newNode;
            return;
        }

        newNode.next = this.head;
        this.head = newNode;
    }

    public void addEnd(int data){
        SLL_Node aux = this.head;
        SLL_Node newNode = new SLL_Node(data);
        while(aux.next != null){
            aux = aux.next;
        }
        aux.next = newNode;
    }

    public void clear() {
        this.head = null;
    }

    /*
    public void addALL(Collection<Integer> collection){
        return;
    }
    */

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

    public int indexOf(int data){
        // return the index of the first occurrence of the specified element
        // or -1 if the list does not contain any element.
        SLL_Node aux = this.head;
        int index = 0;

        while(aux != null){
            if(aux.data == data){
                return index;
            }
            index++;
            aux = aux.next;
        }
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
        while(aux.next.next != null){
            aux = aux.next;
        }
        int temp = aux.data;
        aux.next = null;
        return temp;
    }

    public void remove(int index){
        if(index > this.size() || index < 0){
            System.out.println("SinglyLinked IndexOutOfBoundsException");
            System.exit(-1);
            return;
        }

        if(index == 0){
            this.poll();
            return;
        }else if(index == this.size() - 1){
            this.pollLast();
            return;
        }

        SLL_Node aux = this.head;

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }
        SLL_Node temp = aux.next;
        aux.next = temp.next;
    }

    public int size(){
        // returns the lenght of the list
        SLL_Node aux = this.head;
        int l = 0;
        while(aux != null){
            l++;
            aux = aux.next;
        }
        return l;
    }

    public void reverseIterative(){
        SLL_Node current = this.head;
        SLL_Node prev = null;
        SLL_Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev; // prev is kind of a current
    }

    public SLL_Node reverseRecursive(SLL_Node node){
        // TODO: Do a method that reverse a linkes list recursively
        return node;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        SLL_Node aux = this.head;
        while( aux.next != null){
            result.append(aux.data).append(", ");
            aux = aux.next;
        }
        result.append(aux.data).append(" ]");
        return result.toString();
    }
}