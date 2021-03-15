package com.stack;

import java.util.Arrays;

public class Stack {
    public int items[];
    private int count=0;

    public Stack(int size){
        items=new int[size];
    }

    public void push(int item){

//        if(items.length==count){
//            int newItems[]=new int[items.length * 2];
//
//            // copy existing element
//            for (int i = 0; i < items.length; i++) {
//                 newItems[i] = items[i];
//            }
//
//            items=newItems;
//
//        }
        if(items.length==count)
            throw new StackOverflowError();

        items[count++]=item;
    }

    public int pop(){
        if(count==0)
            throw new IllegalStateException();

        return items[--count];
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

        return items[count-1];
    }

    public boolean isEmpty(){
        return count==0;
    }

    @Override
    public String toString(){
        var content=Arrays.copyOfRange(items,0,count);
        return Arrays.toString(content);
    }

    public void print(){
        for (int i = 0; i < count; i++) {
           System.out.print(" "+items[i]);
        }
        System.out.println();
    }

}
