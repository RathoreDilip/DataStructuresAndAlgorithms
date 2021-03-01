package com.arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {
        Array array=new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);
        array.insert(70);
        array.print();
      //  array.removeAt(3);
        array.print();
        System.out.println(array.indexOf(40));
        array.print();
        System.out.println("---------------------");
        System.out.println("max : "+array.max());
        System.out.println("---------------------");
       // array.insertAt(90,4);
        array.insertAt(110,5);
        array.print();

    }
}
