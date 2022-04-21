package com.dsa.data_structs.queue_sll;

import com.dsa.data_structs.sll.SinglyLinkedList;

public class Queue_SLL {
    private SinglyLinkedList queue;

    public Queue_SLL(int data){
        this.queue = new SinglyLinkedList(data);
    }

    public void add(int data){
        this.queue.addEnd(data);
    }

    public int peek(){
        return this.queue.peek();
    }

    public int poll(){
        return this.queue.poll();
    }

    public int size(){
        return this.queue.size();
    }

    public boolean empty(){
        return this.queue.isEmpty();
    }

    @Override
    public String toString() {
        return this.queue.toString();
    }
}
