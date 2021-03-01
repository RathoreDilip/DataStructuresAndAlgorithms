package com.linkedlist;

import java.util.NoSuchElementException;

// addFirst
// addLast
// deleteFirst
// deleteLast
// contains
// indexOf
public class LinkedList {

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        if (isEmpty())
            return -1;
        else {
            Node temp = first;
            int count = 0;
            while (temp != null) {
                if (temp.value == item)
                    return count;
                temp = temp.next;
                count++;
            }

        }

        return -1;
    }

    public boolean containsOf(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        // if only one element
        if (first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
            //first=first.next;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        // if only one element
        if (first == last)
            first = last = null;
        else{
            Node temp = first;
            while (temp != null) {
                if (temp.next == last) {
                    temp.next = null;
                    last = temp;
                }
                temp = temp.next;
            }
        }

        size--;
    }

    public void removeLast1() {
        if (isEmpty())
            throw new NoSuchElementException();
        // if only one element
        if (first == last)
            first = last = null;
        else {
            var previous = getPreviousNode(last);
            last = previous;
            previous.next = null;
        }
       size--;
    }

    private Node getPreviousNode(Node lastNode){
        var current = first;
        while (current != null) {
            if (current.next == lastNode) return current;
            current = current.next;
        }
        return null;
    }

    // O(1)
    public int size(){
        return size;
    }

    public int[] toArray(){
        int array[]=new int[size];
        Node current=first;
        int index=0;
        while (current!=null)
        {
            array[index++]=current.value;
            current=current.next;
        }
        return array;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

}
