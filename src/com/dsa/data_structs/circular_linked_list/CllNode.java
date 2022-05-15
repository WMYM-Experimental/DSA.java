package com.dsa.data_structs.circular_linked_list;

public class CllNode {
    public int data;
    public CllNode next;

    public CllNode(int data){
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {

        return "( " +
                "Data: " + data +
                ", Next: " + next.data +
                " )";
    }
}
