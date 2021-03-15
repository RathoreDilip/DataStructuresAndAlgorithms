package com.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    ArrayList<Integer> list=null;
    public ArrayListDemo(){

    }

    public ArrayListDemo(int length){
        list=new ArrayList<Integer>(length);
    }
    public void insert(int item){
        list.add(item);
    }

    public void removeAt(int index){
        list.remove(index);
    }

    public void print(){
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public int indexOf(int item){
        return list.indexOf(item);
    }

}
