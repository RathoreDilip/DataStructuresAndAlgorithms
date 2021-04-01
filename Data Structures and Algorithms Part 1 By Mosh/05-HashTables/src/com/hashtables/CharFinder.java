package com.hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {

    public char findFirstNonRepeatingChar(String str){

        Map<Character,Integer> map=new HashMap<>();
        var charArr=str.toCharArray();

        for (char s:charArr) {
            var count=map.containsKey(s) ? map.get(s) : 0;
            map.put(s,count+1);
        }
        System.out.println(map);

        for (char ch:charArr)
            if(map.get(ch)==1)
                return ch;

        return Character.MIN_VALUE;
    }

    public char findFirstRepeatingChar(String str){
        Set<Character> set=new HashSet<>();
        for (char ch:str.toCharArray()) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }

}
