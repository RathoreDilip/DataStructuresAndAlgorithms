package com.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {

    private final List<Character> leftBracket = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBracket = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanceExpression(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(top,ch)) return false;

            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }

    private boolean bracketsMatch(char left,char right){
         return leftBracket.indexOf(left) == rightBracket.indexOf(right);

//        return  (right == ')' && left != '(') ||
//                (right == '>' && left != '<') ||
//                (right == ']' && left != '[') ||
//                (right == '}' && left != '{');
    }

}
