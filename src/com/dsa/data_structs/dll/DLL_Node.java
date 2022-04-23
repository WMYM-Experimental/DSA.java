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

        String nodeCasePrev = this.prev.data + "";
        String nodeCaseNext = this.next.data + "";

        if (this.next == null){
            nodeCaseNext = " null ";
        }

        if (this.prev == null){
            nodeCasePrev = " null ";
        }
        return "( " +
                "Prev: " + nodeCasePrev +
                ", Data:" + data +
                ", Next:" + nodeCaseNext +
                " )";
    }
}
