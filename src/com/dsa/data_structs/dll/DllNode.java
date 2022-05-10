package com.dsa.data_structs.dll;

public class DllNode {
    public int data;
    public DllNode prev;
    public DllNode next;

    public DllNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {

        if (this.prev == null){
            return "( " +
                    "Prev:" + " null " +
                    ", Data:" + data +
                    ", Next:" + this.next.data +
                    " )";
        }

        if (this.next == null){
            return "( " +
                    "Prev:" + this.prev.data +
                    ", Data:" + data +
                    ", Next:" + " null " +
                    " )";
        }
        return "( " +
                "Prev:" + this.prev.data +
                ", Data:" + data +
                ", Next:" + this.next.data +
                " )";
    }
}
