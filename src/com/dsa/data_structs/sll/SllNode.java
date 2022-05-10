package com.dsa.data_structs.sll;

public class SllNode {

    public int data;
    public SllNode next;

    public SllNode(int data){
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
