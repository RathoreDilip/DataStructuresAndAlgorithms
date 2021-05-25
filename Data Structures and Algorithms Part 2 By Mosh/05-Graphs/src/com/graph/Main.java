package com.graph;

public class Main {
    public static void main(String[] args) {
        var graph=new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("D","C");
        graph.addEdge("A","C");
        //graph.print();
        //graph.traverseDepthFirstRec("E");
       // graph.traverseDepthFirstIte("A");
        graph.traverseBreadthFirst("A");

        System.out.println("--------- Topological sort ---------");
        var graph1=new Graph();
        graph1.addNode("X");
        graph1.addNode("A");
        graph1.addNode("B");
        graph1.addNode("P");
        graph1.addEdge("X","A");
        graph1.addEdge("X","B");
        graph1.addEdge("A","P");
        graph1.addEdge("B","P");
        var list=graph1.topologicalSort();
        System.out.println(list);

        System.out.println("--------- Check Cycle in graph ---------");
        var graph2=new Graph();
        graph2.addNode("A");
        graph2.addNode("B");
        graph2.addNode("C");
        graph2.addEdge("A","B");
        graph2.addEdge("B","C");
        //graph2.addEdge("A","C");
        graph2.addEdge("C","A");
        System.out.println(graph2.hasCycle());


    }
}
