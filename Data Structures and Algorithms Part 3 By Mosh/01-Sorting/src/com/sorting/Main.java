package com.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("---------- Bubble Sort -----------");
        System.out.println("==================================");
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]={8,2,4,1,3};
        //int arr[]={50,20,10,15,30};
        //bubbleSort.sort(arr);
        bubbleSort.sortOptimize(arr);
        System.out.println("------------------");
        System.out.println(Arrays.toString(arr));

        System.out.println("==================================");
        System.out.println("-------- Selection Sort ----------");
        System.out.println("==================================");
        SelectionSort selectionSort=new SelectionSort();
        int arr1[]={8,2,4,1,3};
       // int arr1[]={50,20,10,15,30};
        selectionSort.sort(arr1);
        System.out.println("------------------");
        System.out.println(Arrays.toString(arr1));

        System.out.println("==================================");
        System.out.println("-------- Insertion Sort ----------");
        System.out.println("==================================");
        InsertionSort insertionSort=new InsertionSort();
        //int arr2[]={8,2,4,1,3};
        int arr2[]={9,5,1,4,3};
        insertionSort.sort(arr2);
        System.out.println("------------------");
        System.out.println(Arrays.toString(arr2));

    }
}
