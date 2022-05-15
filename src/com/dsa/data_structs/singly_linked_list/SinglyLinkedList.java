package com.dsa.data_structs.singly_linked_list;

public class SinglyLinkedList {
    // atributes
    public SllNode head; // null

    // constructor
    public SinglyLinkedList(int initialHead){
        this.head = new SllNode(initialHead);
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

        SllNode newNode = new SllNode(data);
        SllNode aux = this.head;

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }

        newNode.next = aux.next;
        aux.next = newNode;
    }

    public void addFirst(int data){
        SllNode newNode = new SllNode(data);
        if(this.head == null){
            this.head = newNode;
            return;
        }

        newNode.next = this.head;
        this.head = newNode;
    }

    public void addEnd(int data){
        SllNode aux = this.head;
        SllNode newNode = new SllNode(data);
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
        SllNode aux = this.head;
        while(aux != null){
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
        SllNode aux = this.head;
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
        SllNode aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        return aux.data;
    }

    public int poll(){
        int temp = this.head.data;
        SllNode aux = this.head;
        this.head = aux.next;
        return temp;
    }

    public int pollLast(){
        SllNode aux = this.head;
        while(aux.next.next != null){
            aux = aux.next;
        }
        int temp = aux.data;
        aux.next = null;
        return temp;
    }

    public int remove(int index){
        if(index > this.size() || index < 0){
            System.out.println("SinglyLinked IndexOutOfBoundsException");
            System.exit(-1);
            return -1;
        }

        if(index == 0){
            return this.poll();
        }else if(index == this.size() - 1){
            return this.pollLast();
        }

        SllNode aux = this.head;

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }
        SllNode temp = aux.next;
        aux.next = temp.next;
        return temp.data;
    }

    public int size(){
        // returns the lenght of the list
        SllNode aux = this.head;
        int l = 0;
        while(aux != null){
            l++;
            aux = aux.next;
        }
        return l;
    }

    public void reverseIterative(){
        SllNode current = this.head;
        SllNode prev = null;
        SllNode next;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev; // prev is kind of a current
    }

    public SllNode reverseRecursive(SllNode node){
        // TODO: Do a method that reverse a linkes list recursively
        return node;
    }

    public boolean isEmpty(){
        return this.size() <= 0 || this.head == null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        SllNode aux = this.head;
        while( aux.next != null){
            result.append(aux.data).append(", ");
            aux = aux.next;
        }
        result.append(aux.data).append(" ]");
        return result.toString();
    }

    public String toNodesString() {
        StringBuilder result = new StringBuilder("[ ");
        SllNode aux = this.head;
        while( aux.next != null){
            result.append(aux.toString()).append(", ");
            aux = aux.next;
        }
        result.append(aux.toString()).append(" ]");
        return result.toString();
    }
}