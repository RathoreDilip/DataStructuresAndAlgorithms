package com.hashtables;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // find the first non-repeated character
        String str="a green apple";
        CharFinder finder=new CharFinder();
        var ch=finder.findFirstNonRepeatingChar(str);
        System.out.println(ch);

        // find the first repeated character
        String s="green apple";
        var repCh=finder.findFirstRepeatingChar(s);
        System.out.println(repCh);

        // Build a HashTable chaining
        HashTable table=new HashTable();
        table.put(6,"A");  // 1
        table.put(8,"B");  // 3
        table.put(11,"C");
        System.out.println("Done");
        table.print();
        System.out.println(table.get(11));
        table.remove(11);
        System.out.println(table.get(11));

        // hashTables Exercise
        System.out.println("-------- HashTable Exercise --------------");
        int arr[]={1, 2, 2, 3, 3, 3, 4};
        HashTableExercises tableExercises=new HashTableExercises();
        System.out.println(tableExercises.mostFrequent(arr));

        int arr1[]={1, 7, 5, 9, 2, 12, 3};
        System.out.println(tableExercises.countPairsWithDiff(arr1,2));

        int arr2[]={2, 7, 11, 15};
        System.out.println(Arrays.toString(tableExercises.twoSum(arr2,18)));

    }


}
