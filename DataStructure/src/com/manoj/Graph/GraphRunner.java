package com.manoj.Graph;

public class GraphRunner {

	public static void main(String[] args) {
		 Graph graph = new Graph();

	      graph.addVertex('A');   //0
	      graph.addVertex('B');   //1
	      graph.addVertex('C');   //2
	      graph.addVertex('D');   //3
	      graph.addVertex('E');   //4
	      graph.addVertex('F');   //5
	      graph.addVertex('G');   //6

	      /*       1  2  3   
	       * 0  |--B--C--D
	       * A--|
	       * |
	       * |     4 
	       * |-----E
	       * |     5  6
	       * |  |--F--G
	       * |--| 
	       */        
	      graph.addEdge(0, 1);   //AB
	      graph.addEdge(1, 2);   //BC
	      graph.addEdge(2, 3);   //CD
	      graph.addEdge(0, 4);   //AC
	      graph.addEdge(0, 5);   //AF
	      graph.addEdge(5, 6);   //FG
	      System.out.print("Depth First Search: ");
	      //A B C D E F G
	      graph.depthFirstSearch();        
	      System.out.println("");
	      System.out.print("Breadth First Search: ");
	      //A B E F C G D
	      graph.breadthFirstSearch();
	}

}
