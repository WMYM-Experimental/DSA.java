package com.dsa.data_structs.dll;

public class DoublyLinkedList {
    public DllNode head;

    public DoublyLinkedList(int initialHead){
        this.head = new DllNode(initialHead);
    }

    public void add(int index, int data){
        DllNode newNode = new DllNode(data);
        DllNode aux = this.head;

        if(this.head == null){
            this.head = newNode;
            return;
        }

        if (index > this.size() || index < 0){
            System.out.println("DoublyLinkedList IndexOutOfBoundsException");
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

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }

        newNode.prev = aux;
        newNode.next = aux.next;
        aux.next = newNode;
    }

    public void addFirst(int data){
        DllNode newNode = new DllNode(data);
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    public void addEnd(int data){
        DllNode aux = this.head;
        DllNode newNode = new DllNode(data);
        while(aux.next != null){
            aux = aux.next;
        }
        newNode.prev = aux;
        aux.next = newNode;
    }

    public void clear() {
        this.head = null;
    }

    public boolean contains(int data){
        DllNode aux = this.head;
        while(aux != null){
            if(aux.data == data){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    public int indexOf(int data){
        DllNode aux = this.head;
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
        DllNode aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        return aux.data;
    }

    public int poll(){
        int temp = this.head.data;
        this.head = this.head.next;
        this.head.prev = null;
        return temp;
    }

    public int pollLast(){
        DllNode aux = this.head;
        int temp;
        while(aux.next.next != null){
            aux = aux.next;
        }
        temp = aux.data;
        aux.next = null;
        return temp;
    }

    public int remove(int index){
        DllNode aux = this.head;

        if (index > this.size() || index < 0 || this.head == null){
            System.out.println("DoublyLinkedList IndexOutOfBoundsException");
            System.exit(-1);
            return -1;
        }

        if(index == 0){
            return this.poll();
        }else if(index == this.size() - 1){
            return this.pollLast();
        }

        for (int i = 0; i < index - 1; i++) {
            aux = aux.next;
        }

        DllNode temp = aux.next;
        temp.next.prev = aux;
        aux.next = temp.next;

        return temp.data;
    }

    public int size(){
        DllNode aux = this.head;
        int len = 0;
        while(aux != null){
            len++;
            aux = aux.next;
        }
        return len;
    }

    public void reverseIterative(){
        // TODO: improve this algo
        DllNode current = this.head;
        DllNode next;
        DllNode prev = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    public DllNode reverseRecursive(DllNode node){
        // TODO: reverseRecursively a dll
        return this.head;
    }

    public boolean isEmpty(){
        return this.size() == 0 || this.head == null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        DllNode aux = this.head;

        while( aux.next != null){
            result.append(aux.data).append(", ");
            aux = aux.next;
        }
        result.append(aux.data).append(" ]");
        return result.toString();
    }

    public String toNodesString() {
        StringBuilder result = new StringBuilder("[ ");
        DllNode aux = this.head;

        while( aux.next != null){
            result.append(aux.toString()).append(", ");
            aux = aux.next;
        }
        result.append(aux.toString()).append(" ]");
        return result.toString();
    }
}
