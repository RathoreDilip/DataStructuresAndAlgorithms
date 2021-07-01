package com.string;

import java.util.*;

public class StringUtil {
    public static int getNoOfVowels(String str) {
        if (str == null)
            return 0;

        String vowels = "aeiou";
        int count = 0;
        for (char c : str.toLowerCase().toCharArray())
            if (vowels.indexOf(c) != -1)
                count++;

        return count;
    }

    public static String getReverseString(String str){
        if(str==null)
            return "";

        StringBuilder stringBuilder=new StringBuilder();

        for (int i = str.length()-1; i >=0 ; i--)
            stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }

    public static String getReverseWords(String sentence){
//        String newStr[]=sentence.split(" ");
//        StringBuilder revWord=new StringBuilder();
//
//        for (int i = newStr.length-1; i >=0 ; i--)
//            revWord.append(newStr[i]).append(" ");
//
//        return revWord.toString().trim();

        String words[]=sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);

    }

    public static boolean areRotations(String str1,String str2){

        if(str1==null || str2==null)
            return false;

//        if(str1.length()!=str2.length())
//            return false;
//
//        if(!(str1+str1).contains(str2))
//            return false;

        return (str1.length()==str2.length() && (str1+str1).contains(str2));
    }

    public static String removeDuplicates(String str){
        if(str==null)
            return "";
        StringBuilder output=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for (char ch:str.toCharArray()) {
            if(!set.contains(ch)){
                set.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static char getMaxOccuringChar(String str){

        // 1st way using hashmap

//        Map<Character,Integer> map=new HashMap<>();
//        for (char ch:str.toCharArray()) {
//            if(map.containsKey(ch))
//                map.put(ch,map.get(ch)+1);
//            else
//                map.put(ch,1);
//        }
//        System.out.println(map);
//
//        int max=0;
//        char result=' ';
//        for (Map.Entry<Character,Integer> entry : map.entrySet())
//            if(entry.getValue() > max) {
//                max = entry.getValue();
//                result=entry.getKey();
//            }
//
//        return result;

        // 2nd way using ascii table

        if(str.isBlank() || str==null)
            throw new IllegalArgumentException();

        final int ASCII_SIZE=256;
        int frequencies[]=new int[ASCII_SIZE];
        for (var ch:str.toCharArray())
            frequencies[ch]++;

        int max=0;
        char result=' ';
        for (int i = 0; i < frequencies.length; i++)
            if(frequencies[i]>max){
                max=frequencies[i];
                result=(char)i;
            }

        return result;
    }

    public static String getCapitalizeSentence(String sentence){
        if(sentence.trim().isBlank() || sentence==null)
            return "";

        String words[]=sentence.trim().replaceAll(" +"," ").split(" ");

        for (int i = 0; i < words.length ; i++){
            words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        }

        return String.join(" ",words);

    }

    //  O(n log n)
    public static boolean areAnagram(String first,String second){
        if(first==null || second==null)
            return false;

        // O(n)
        var array1=first.toLowerCase().toCharArray();
        // O(n log n)
        Arrays.sort(array1);

        // O(n)
        var array2=second.toLowerCase().toCharArray();
        // O(n log n)
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }

    // O(n)
    public static boolean areAnagram2(String first,String second){
        if(first==null || second==null)
            return false;

        final int ENGLISH_ALPHABET=26;
        int frequencies[]=new int[ENGLISH_ALPHABET];

        // O(n)
        first=first.toLowerCase();
        for (int i = 0; i < first.length(); i++)
            frequencies[first.charAt(i)-'a']++;

        System.out.println(Arrays.toString(frequencies));

        // O(n)
        second=second.toLowerCase();
        for (int i = 0; i <second.length() ; i++) {
            var index=second.charAt(i)-'a';
            if(frequencies[index]==0)
                return false;
            frequencies[index]--;
        }

        System.out.println(Arrays.toString(frequencies));

        return true;
    }

    public static boolean isPalindrome(String str){
        if(str==null)
            return false;

        int left=0;
        int right=str.length()-1;
        while (left<right)
            if(str.charAt(left++)!=str.charAt(right--))
                return false;

        return true;
    }

}
