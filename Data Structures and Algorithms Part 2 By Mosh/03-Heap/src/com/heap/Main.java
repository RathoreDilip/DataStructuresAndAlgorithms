package com.heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var heap = new Heap(5);
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);
        System.out.println(heap.printHeap());
        heap.remove();
        System.out.println(heap.printHeap());

        System.out.println("------ Heap Sort --------");
        int numbers[] = {5, 3, 10, 1, 4, 2};
        var heapSort = new Heap(numbers.length);
        for (var number : numbers) {
            heapSort.insert(number);
        }
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = heapSort.remove();
        System.out.println("------ Heap Sort Descending order --------");
        System.out.println(Arrays.toString(numbers));
//        for (int i = numbers.length-1; i >=0; i--)
//            numbers[i]=heapSort.remove();
//        System.out.println("------ Heap Sort Ascending order --------");
//        System.out.println(Arrays.toString(numbers));

        System.out.println("------ Heapify --------");
        int num[] = {5, 3, 8, 4, 1, 2};
        System.out.println("input :: "+Arrays.toString(num));
        MaxHeap.heapify(num);
        System.out.println(Arrays.toString(num));

        System.out.println("------ Kth Largest Element -------");
        System.out.println(MaxHeap.getKthLargetValue(num,5));
    }
}
