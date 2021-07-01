package com.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] items) {
        for (int i = 0; i < items.length; i++)
            for (int j = i + 1; j < items.length; j++)
                if (items[i] > items[j])
                    swap(items, i, j);


    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void sortOptimize(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            System.out.println("\n Step : "+i);
            System.out.println("--------------");
            isSorted=true;
            for (int j = 0; j < array.length-1-i; j++){
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                    isSorted=false;
                }
                System.out.println(Arrays.toString(array));
            }

           if(isSorted)
               return;
        }
    }

}
