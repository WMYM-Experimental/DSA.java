package com.dsa.data_structs.sll;

public class SLL_Node {

    public int data;
    public SLL_Node next = null;

    public SLL_Node(int data){
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        if (this.next == null){
            return "( " +
                    "Data: " + data +
                    ", Next: " + " null " +
                    " )";
        }

        return "( " +
                "Data: " + data +
                ", Next: " + next.data +
                " )";
    }
}
