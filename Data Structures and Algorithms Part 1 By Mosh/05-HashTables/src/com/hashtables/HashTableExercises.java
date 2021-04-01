package com.hashtables;

import java.util.HashMap;
import java.util.Map;

public class HashTableExercises {

    public int mostFrequent(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for (var a:arr){
           int count= (map.containsKey(a)) ? map.get(a) : 0;
           map.put(a,count+1);
        }
        System.out.println(map);

        int max=0;int key=0;
        for (var entry:map.entrySet()) {
            if(max<entry.getValue()) {
                max = entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }

    public int countPairsWithDiff(int arr[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        for (var a1:arr)
            for (var a2:arr)
                if((a1-a2==k))
                    map.put(a1,a2);

        System.out.println(map);
        return map.size();
    }

    public int[] twoSum(int arr[],int target){
        int res[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((arr[i]+arr[j]==target))
                {
                    res[0]=j;res[1]=i;
                    break;
                }
            }
        }
        return res;
    }


}
