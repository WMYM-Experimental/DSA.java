package com.dsa.data_structs.stack_sll;

import com.dsa.data_structs.sll.SinglyLinkedList;

public class StackSll {
    private SinglyLinkedList stk;

    public StackSll(int data){
        this.stk = new SinglyLinkedList(data);
    }

    public void push(int data){
        this.stk.addEnd(data);
    }

    public int pop(){
        return this.stk.pollLast();
    }

    public int peek(){
        return this.stk.peekLast();
    }

    public int size(){
        return this.stk.size();
    }

    public boolean empty(){
        return this.stk.isEmpty();
    }

    public int search(int data){
        return this.stk.indexOf(data);
    }

    public void reverse(){
        this.stk.reverseIterative();
    }

    @Override
    public String toString() {
        return this.stk.toString();
    }
}
