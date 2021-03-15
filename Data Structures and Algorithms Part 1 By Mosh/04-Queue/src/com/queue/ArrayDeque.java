package com.queue;

import java.util.Arrays;

public class ArrayDeque {
    private int front;
    private int rear;
    private int[] queue;
    int count;

    public ArrayDeque(int size){
        queue=new int[size];
    }

    public void add(int item){
        if(count==queue.length)
            throw new IllegalStateException();

        queue[rear]=item;
        rear=(rear+1) % queue.length;
        count++;
    }

    public int remove(){
        var item=queue[front];
        queue[front]=0;
        front=(front+1) % queue.length;
        count--;
        return item;
    }

    public int peek(){
        return queue[front];
    }

    @Override
    public String toString() {
      // var content=Arrays.copyOfRange(queue,front,rear);
        return Arrays.toString(queue);
    }
}
