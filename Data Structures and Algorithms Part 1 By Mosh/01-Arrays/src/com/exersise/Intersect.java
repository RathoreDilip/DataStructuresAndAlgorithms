package com.exersise;

public class Intersect {
    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
