package com.search;

public class BinarySearch {
    public int search(int arr[],int value){
      int left=0;
      int right=arr.length-1;

      while (left<=right){
         int middle=(left+right)/2;
         if(arr[middle]==value)
             return middle;

         if(arr[middle]>value)
             right=middle-1;
         else
             left=middle+1;
      }

      return -1;
    }
}
