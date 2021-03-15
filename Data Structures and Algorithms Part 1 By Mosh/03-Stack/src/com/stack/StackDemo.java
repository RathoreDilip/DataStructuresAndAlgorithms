package com.stack;

public class StackDemo {
    public static void main(String[] args) {
        String str = "abcdefgh";
        var stringReverserObj = new StringReverser();
        //  System.out.println(stringReverserObj.reverse(str));

        var balanceExpression = new BalancedExpression();
        str = "([10+20])";
        System.out.println(balanceExpression.isBalanceExpression(str));
        System.out.println();

        System.out.println("------------ Implement Stack using arrays ------------------");
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);


        System.out.println(stack.pop());
        System.out.println(stack);
       // stack.print();
       // System.out.println(stack.peek());
       // System.out.println(stack.pop());
       // System.out.println(stack.isEmpty());
       // stack.print();
        // System.out.println(stack.peek());





    }
}
