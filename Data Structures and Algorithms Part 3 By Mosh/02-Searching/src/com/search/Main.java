package com.search;

public class Main {
    public static void main(String[] args) {
        // Linear search
        LinearSearch linearSearch=new LinearSearch();
        int arr[]={6,2,5,4,3,7};
        int index=linearSearch.search(arr,7);
        if(index!=-1)
            System.out.println(arr[index]+" element found at position "+index);
        else
            System.out.println("element not found.");

        // Binary search (need to be sorted arrays element)
        // Iterative way
        int binArr[]={3,5,6,9,11,18,20,21,24,30};
        BinarySearch binarySearch=new BinarySearch();
        int valIndex=binarySearch.search(binArr,7);
        if(valIndex!=-1)
            System.out.println(binArr[valIndex]+" element found at position "+valIndex);
        else
            System.out.println("element not found.");



    }
}
