package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] items) {
        int min=0,minIndex=0;
        for (int i = 0; i < items.length; i++) {
            min = items[i];
            minIndex=i;
            for (int j = i; j < items.length; j++) {
                if (min > items[j]) {
                    min = items[j];
                    minIndex = j;
                }
            }
            System.out.println(Arrays.toString(items));
            System.out.println("min :: "+min+"--- minIndex :: "+minIndex);
            swap(items,minIndex,i);
        }

    }
    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
