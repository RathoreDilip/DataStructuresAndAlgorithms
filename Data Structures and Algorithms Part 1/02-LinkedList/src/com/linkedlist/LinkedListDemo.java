package com.linkedlist;

import java.util.Arrays;

public class LinkedListDemo {

    public static void main(String[] args) {
        var list=new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);



        // list.addFirst(50);
       // list.addFirst(60);
//        System.out.println(list.indexOf(40));
//        System.out.println(list.containsOf(50));
//        System.out.println(list.containsOf(100));
       // list.removeFirst();
        list.removeLast1();
        list.removeLast1();
        System.out.println(list.size());
        var array=list.toArray();
        System.out.println(Arrays.toString(array));

        list.print();
    }

}
