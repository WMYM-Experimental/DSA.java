package com.dsa.data_structs.dll;

public class DLL_Node {
    public int data;
    public DLL_Node prev;
    public DLL_Node next;

    public DLL_Node(int data){
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
