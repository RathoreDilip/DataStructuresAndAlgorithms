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

        // Queue with two stacks
        System.out.println("----------- QueueWithTwoStacks -------------");
        QueueWithTwoStacks q2=new QueueWithTwoStacks();
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueue(30);
        q2.dequeue();
        q2.dequeue();
        var item=q2.dequeue();
        System.out.println(item);

        // Priority Queue
        System.out.println("----------- Priority Queue -------------");
//        java.util.PriorityQueue<Integer> pq=new  java.util.PriorityQueue<Integer>();
//        pq.add(5);
//        pq.add(2);
//        pq.add(3);
//        System.out.println("PrirityQueue :: "+pq);
//        while (!pq.isEmpty())
//            System.out.println(pq.remove());

        PriorityQueue pq1=new PriorityQueue(5);
        pq1.add(7);
        pq1.add(3);
        pq1.add(5);
        pq1.add(1);
        pq1.add(4);
        System.out.println(pq1.toString());

        while (!pq1.isEmpty())
            System.out.println(pq1.remove());


        // QueueReverser - Exercise
        System.out.println("----------- Queue Reverser With K -------------");
        Queue<Integer> qr=new ArrayDeque<>();
        qr.add(10);
        qr.add(20);
        qr.add(30);
        qr.add(40);
        qr.add(50);
        QueueReverser qR=new QueueReverser();
        var res=qR.reverse(qr,3);
        System.out.println(res);

    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack=new Stack();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());

    }
}
