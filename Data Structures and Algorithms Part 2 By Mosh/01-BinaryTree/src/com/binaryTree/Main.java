package com.binaryTree;

public class Main {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(52));
        System.out.println("--- Pre order ----");
        tree.traversePreOrder();
        System.out.println("\n--- In order ----");
        tree.traverseInOrder();
        System.out.println("\n--- Post order ----");
        tree.traversePostOrder();
        System.out.println("\n--- Height ----");
        System.out.println(tree.height());
        System.out.println("--- Min ----");
        System.out.println(tree.min());

        Tree tree1=new Tree();
        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(1);
        tree1.insert(61);
        tree1.insert(8);
        tree1.insert(10);
        System.out.println(tree.equals(tree1));
      //  System.out.println("--- Swap Root ----");
      //  tree.swapRoot();
        System.out.println("--- Validating Binary Search 1 ----");
        System.out.println(tree.validatingBinarySearchTree());
        System.out.println("--- Validating Binary Search 2 ----");
        System.out.println(tree.isBinarySearchTree());
        System.out.println("--- Nodes at K Distance --- ");
        var list=tree.getNodesAtKDistance(1);
        System.out.println(list);
        System.out.println("--- Traverse Level Order ---");
        tree.traverseLevelOrder();

        // Exercise
        System.out.println("\n\n=============== EXERCISE ===============");
        // Exercise - 1 : Implement a method to calculate the size of a binary tree.
        System.out.println("--- Size of a binary tree --- ");
        System.out.println(tree.getSizeOfBinaryTree());

        // Exercise - 2 : Implement a method to count the number of leaves in a binary tree.
        System.out.println("--- Count the number of leaves --- ");
        System.out.println(tree.getCountLeaves());

        // Exercise - 3 : Implement a method to return the maximum value in a binary search tree using recursion.
        System.out.println("--- Find max number using recursion --- ");
        System.out.println(tree.findMaxNumber());

        // Exercise - 4 : Implement a method to check for the existence of a value in a binary tree using recursion.
        System.out.println("--- Check number contains or not using recursion --- ");
        System.out.println(tree.contains(10));

        // Exercise - 5 : Implement a method to check to see if two values are siblings in a binary tree
        System.out.println("--- Check 2 numbers are siblings or not --- ");
        System.out.println(tree.checkSiblingOrnot(4,5));

        // Exercise - 6 : Implement a method to return the ancestors of a value in a List<Integer>.
        System.out.println("--- print ancestors of a value --- ");
        System.out.println(tree.checkSiblingOrnot(4,5));


    }


}
