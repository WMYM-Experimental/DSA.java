package com.dsa.data_structs.doubly_circular_linked_list;

import com.dsa.data_structs.doubly_linked_list.DllNode;

public class DcllNode {
    public int data;
    public DcllNode prev;
    public DcllNode next;

    public DcllNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "( " +
                "Prev:" + this.prev.data +
                ", Data:" + data +
                ", Next:" + this.next.data +
                " )";
    }
}
