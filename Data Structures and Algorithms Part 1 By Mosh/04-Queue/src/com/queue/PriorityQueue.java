package com.queue;

import java.util.Arrays;

public class PriorityQueue {
    private int pq[];
    private int count;

    public PriorityQueue(int size){
        pq=new int[size];
    }

    public void add(int item){
        if(isFull())
            throw new IllegalStateException();

        var i=shiftItemsToInsert(item);
        pq[i]=item;
        count++;
    }

    public boolean isFull(){
        return count==pq.length;
    }

    public int shiftItemsToInsert(int item){
        int i;
        for (i = count-1; i>=0 ; i--) {
            if(pq[i]>item)
                pq[i+1]=pq[i];
            else
                break;

        }
        return i+1;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();

        return pq[--count];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public String toString(){
       // var newArr=Arrays.copyOfRange(pq,0,count);
        return Arrays.toString(pq);
    }
}
