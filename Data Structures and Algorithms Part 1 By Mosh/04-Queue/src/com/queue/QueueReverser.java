package com.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    public Queue<Integer> reverse(Queue<Integer> queue,int K){

        Stack<Integer> stack=new Stack<Integer>();
        Queue<Integer> temp=new ArrayDeque<Integer>();

        for (int j = 0; j < K; j++)
               if (!queue.isEmpty())
                    stack.push(queue.remove());

        while (!queue.isEmpty())
            temp.add(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        while (!temp.isEmpty())
            queue.add(temp.remove());

        return queue;
    }

}
