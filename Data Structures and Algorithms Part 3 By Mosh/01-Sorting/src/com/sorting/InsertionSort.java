package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] items) {
        System.out.println(Arrays.toString(items));
        System.out.println("====================");
        for (int i = 1; i < items.length; i++) {
                int key=items[i];
                System.out.println("key :: "+key);
                int j=i-1;
                while (j>=0 && items[j]>key){
                    items[j+1]=items[j];
                    j--;
                    System.out.println(Arrays.toString(items));
                }
                items[j+1]=key;
            System.out.println("----------------------");
            System.out.println(Arrays.toString(items));
        }
    }

}
