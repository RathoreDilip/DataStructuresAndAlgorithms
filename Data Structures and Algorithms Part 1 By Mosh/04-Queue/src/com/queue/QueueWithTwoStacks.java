package com.queue;

import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();

    // O(1)
    public void enqueue(int item){
        stack1.push(item);
    }

    // O(n)
    public int dequeue(){
        if(isEmpty())
            throw new IllegalArgumentException();

        moveStack1toStack2();

        return stack2.pop();
    }

    private void moveStack1toStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalArgumentException();

        moveStack1toStack2();

        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }


}
