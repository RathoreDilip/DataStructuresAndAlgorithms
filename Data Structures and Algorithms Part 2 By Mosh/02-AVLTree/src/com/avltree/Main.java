package com.avltree;

public class Main {
    public static void main(String[] args) {
        // 10
        //   \
        //    20
        //     \
        //      30
        var avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(30);
        avlTree.insert(20);
    }
}
