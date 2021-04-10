package com.binaryTree;

import java.util.ArrayList;

public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value=value;
        }

        @Override
        public String toString() {
            return "Node="+value;
        }
    }

    private Node root;

    public void insert(int value){
        var node=new Node(value);
        if(root==null) {
            root = node;
            return;
        }

        var current=root;
        while (true){
            if(value < current.value){
                if(current.leftChild==null){
                    current.leftChild=node;
                    break;
                }
                current=current.leftChild;
            }else {
                if(current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
                current=current.rightChild;
            }
        }

    }

    public boolean find(int value){
        var current=root;
        if(current!=null && current.value==value){
            return true;
        }
        while (current!=null){
            if(value < current.value)
                current=current.leftChild;
            else if(value > current.value)
                current=current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    public int height(){
      return height(root);
    }

    public boolean validatingBinarySearchTree(){
        return validatingBinarySearchTree(root);
    }

    private void traversePostOrder(Node root){
        if(root==null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value+" ");
    }


    private void traverseInOrder(Node root){
        if(root==null)
            return;

        traverseInOrder(root.leftChild);
        System.out.print(root.value+" ");
        traverseInOrder(root.rightChild);
    }

    private void traversePreOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.value+" ");

        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private int height(Node root){
        if(isLeaf(root))
            return 0;

        return 1+(Math.max(height(root.leftChild),height(root.rightChild)));

    }

    private boolean isLeaf(Node node){
        return node.leftChild==null && node.rightChild==null;
    }

    // O(log n)
    public int min(){
        if(root==null)
            throw new IllegalStateException();

        Node current=root;
        Node last=current;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last.value;
    }

    // O(n)
    private int min(Node root){
       if(isLeaf(root))
           return root.value;

        var left=min(root.leftChild);
        var right=min(root.rightChild);

        return Math.min(Math.min(left,right),root.value);
    }

    public boolean equals(Tree other){
        if(other==null)
            return false;
        return equals(root,other.root);
    }

    private boolean equals(Node first,Node second){
      if(first==null && second==null)
          return true;

      if (first!=null && second!=null)
          return first.value==second.value
                  && equals(first.leftChild,second.leftChild)
                  && equals(first.rightChild,second.rightChild);

      return false;
    }

    private boolean validatingBinarySearchTree(Node root){
        if(root==null)
            return true;

        validatingBinarySearchTree(root.leftChild);

        if(root!=null && root.leftChild!=null)
            if(root.leftChild.value > root.value)
                return false;

            validatingBinarySearchTree(root.rightChild);

        if(root!=null && root.rightChild!=null)
            if(root.rightChild.value < root.value)
                return false;

      return true;
    }

    public void swapRoot(){
        var temp=root.leftChild;
        root.leftChild=root.rightChild;
        root.rightChild=temp;
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root,int min,int max){
        if(root==null)
            return true;

        if(root.value < min || root.value>max)
            return false;

        return isBinarySearchTree(root.leftChild,min,root.value-1) &&
               isBinarySearchTree(root.rightChild,root.value+1,max);
    }

    public ArrayList<Integer> getNodesAtKDistance(int distance){
        var list=new ArrayList<Integer>();
        getNodesAtKDistance(root,distance,list);
        return list;
    }

    private void getNodesAtKDistance(Node root,int distance,ArrayList<Integer> list){
        if(root==null)
            return;

        if(distance==0)
        {
            list.add(root.value);
            //System.out.print(root.value+" ");
            return;
        }

        //System.out.print("value="+root.value+" k="+k+" | ");
        getNodesAtKDistance(root.leftChild,distance-1,list);
        getNodesAtKDistance(root.rightChild,distance-1,list);
    }

    public void traverseLevelOrder(){
        for (int i = 0; i<=height() ; i++)
            for (var item:getNodesAtKDistance(i))
                System.out.print(item+" ");

    }

    public int getSizeOfBinaryTree(){
        return getSizeOfBinaryTree(root);
    }

    private int getSizeOfBinaryTree(Node root){
//        int count=0;
//        for (int i = 0; i<=height() ; i++)
//            for (var item:getNodesAtKDistance(i))
//                count+=1;
        if(root==null)
            return 0;

        return 1 + getSizeOfBinaryTree(root.leftChild) + getSizeOfBinaryTree(root.rightChild);
    }

    public int getCountLeaves(){
        return getCountLeaves(root);
    }

    private int getCountLeaves(Node root){
        if(root==null)
            return 0;
        if(isLeaf(root))
            return 1;
        else
            return getCountLeaves(root.leftChild) + getCountLeaves(root.rightChild);
    }

    public int findMaxNumber(){
        var list=new ArrayList<Integer>();
        findMaxNumber(root,list);
        return list.get(list.size()-1);
    }

    private void findMaxNumber(Node root,ArrayList<Integer> list){
        if(root==null)
            return;

        findMaxNumber(root.leftChild,list);
        //System.out.print(root.value+" ");
        list.add(root.value);
        findMaxNumber(root.rightChild,list);
    }

    public boolean contains(int value){
        return contains(root,value);
    }

    private boolean contains(Node root,int value){
        if(root==null)
            return false;

       // System.out.println(root.value);
        if(root.value==value)
            return true;

        if(root.value > value)
           return contains(root.leftChild,value);
        else if(root.value < value)
           return contains(root.rightChild,value);

        return false;
    }

    public boolean checkSiblingOrnot(int left,int right){
        return checkSiblingOrnot(root,left,right);
    }

    private boolean checkSiblingOrnot(Node root,int leftValue,int rightValue){
        if(root==null)
            return false;

        boolean a = false, b = false, c = false;
        if(root.leftChild!=null && root.rightChild!=null){
            a=( (root.leftChild.value==leftValue && root.rightChild.value==rightValue) ||
            (root.leftChild.value==rightValue && root.rightChild.value==leftValue) );
        }
        // Check for left subtree
        if(root.leftChild!=null)
            b=checkSiblingOrnot(root.leftChild,leftValue,rightValue);

        // Check for right subtree
        if(root.rightChild!=null)
            c=checkSiblingOrnot(root.rightChild,leftValue,rightValue);

        return (a || b || c);
    }

    private void printAncestors(){

    }

}
