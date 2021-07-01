package com.string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Find the number of vowels in a string. Vowels in English are A, E, O, U and I
        System.out.println(StringUtil.getNoOfVowels("hello"));

        // Reverse a string.
        System.out.println(StringUtil.getReverseString("blue"));

        // Reverse the order of words in a sentence.
        // Input: “Trees are beautiful”
        // Output: “beautiful are Trees”
        String reverse=StringUtil.getReverseWords("    Trees are beautiful ");
        System.out.println("'"+reverse+"'");

        // Check if a string is a rotation of another string.
        // Input: “ABCD”, “DABC” (rotate one char to the right)
        // Output: true
        // Input: “ABCD”, “CDAB” (rotate two chars to the right)
        // Output: true
        // Input: “ABCD”, “ADBC”
        // Output: false
        System.out.println(StringUtil.areRotations("ABCD","ADBC"));


        // Remove duplicate characters in a string.
        // Input: “Hellooo!!”
        // Output: “Helo!”
        System.out.println(StringUtil.removeDuplicates("Hellooo!!"));

        // Find the most repeated character in a string.
        // Input: “Hellooo!!”
        // Output: ‘o’
        System.out.println(StringUtil.getMaxOccuringChar("Hellooo!!"));


        // Capitalize the first letter of each word in a sentence. Also, remove any
        // extra spaces between words.
        // Input: “trees are beautiful”
        // Output: “Trees Are Beautiful”
        // Input: “ trees     are         beautiful ”
        // Output: “Trees Are Beautiful”
        System.out.println(StringUtil.getCapitalizeSentence("trees   are     beautiful"));

        // Detect if two strings are anagram of each other. A string is an
        // anagram of another string if it has the exact same characters in any
        // order.
        // Input: “abcd”, “adbc”
        // Output: true
        // Input: “abcd”, “cadb”
        // Output: true
        // Input: “abcd”, “abcd”
        // Output: true
        // Input: “abcd”, “abce”
        // Output: false
        System.out.println(StringUtil.areAnagram("abcd","abce"));
        System.out.println(StringUtil.areAnagram2("abcd","abce"));


        // Check if a string is palindrome. If we read a palindrome string from
        // left or right, we get the exact same characters.
        // Input: “abba”
        // Output: true
        // Input: “abca”
        // Output: false
        System.out.println(StringUtil.isPalindrome("abba"));



    }
}
