package com.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println("-------- Queue Reverse ---------");
        reverse(queue);
        System.out.println(queue);
        System.out.println("---------- ArrayDeque ---------");
        var q=new com.queue.ArrayDeque(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        q.remove();
        q.remove();
        System.out.println(q);
        q.add(50);
        System.out.println(q);
        q.add(60);    // circular array
        System.out.println(q);
        q.add(70);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.add(80);
        System.out.println(q);

//        System.out.println(q.isEmpty());
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);
//        System.out.println(q.isEmpty());
//        q.remove();
//        System.out.println(q);
//        System.out.println(q.isEmpty());
//        q.remove();
//        System.out.println(q.isEmpty());
//        System.out.println(q);

    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack=new Stack();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());

    }
}
