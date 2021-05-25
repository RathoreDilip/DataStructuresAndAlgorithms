package com.queue;

public class PriortiyQueueWithHeap {

    private Heap heap=new Heap(5);

    public void add(int value){
        heap.insert(value);
    }

    public int remove(){
        return heap.remove();
    }

    public String printHeap(){
        return heap.printHeap();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

}
