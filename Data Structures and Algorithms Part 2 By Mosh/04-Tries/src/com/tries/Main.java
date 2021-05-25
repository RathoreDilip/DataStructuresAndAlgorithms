package com.tries;

public class Main {
    public static void main(String[] args) {
        var trie=new Trie();
        trie.insert("car");
        trie.insert("care");
        //trie.insert("can");
        System.out.println("Done");
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("care"));
        trie.travserse();
        System.out.println("------------- Remove Word -------------");
        trie.remove("care");
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("care"));

        System.out.println("-------------- Auto Completion------------");
        var trie1=new Trie();
        trie1.insert("car");
        trie1.insert("card");
        trie1.insert("care");
        trie1.insert("careful");
        trie1.insert("egg");
        var words=trie1.findWords("ca");
        System.out.println(words);

    }
}
