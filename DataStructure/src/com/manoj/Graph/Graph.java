package com.manoj.Graph;

public class Graph {
	   private final int MAX = 20;
	   //array of vertices
	   private Vertex lstVertices[];
	   //adjacency matrix
	   private int adjMatrix[][];
	   //vertex count
	   private int vertexCount;

	   private Stack stack;
	   private Queue queue;

	   public Graph(){
	      lstVertices = new Vertex[MAX];
	      adjMatrix = new int[MAX][MAX];
	      vertexCount = 0;
	      stack = new Stack(MAX);
	      queue = new Queue(MAX);
	      for(int j=0; j<MAX; j++) // set adjacency
	         for(int k=0; k<MAX; k++) // matrix to 0
	            adjMatrix[j][k] = 0;
	   } 

	   //add vertex to the vertex list
	   public void addVertex(char label){
	      lstVertices[vertexCount++] = new Vertex(label);
	   }

	   //add edge to edge array
	   public void addEdge(int start,int end){
	      adjMatrix[start][end] = 1;
	      adjMatrix[end][start] = 1;
	   }

	   //display the vertex
	   public void displayVertex(int vertexIndex){
	      System.out.print(lstVertices[vertexIndex].label+" ");
	   }       

	   //get the adjacent unvisited vertex
	   public int getAdjUnvisitedVertex(int vertexIndex){
	      for(int i=0; i<vertexCount; i++)
	         if(adjMatrix[vertexIndex][i]==1 && lstVertices[i].visited==false)
	            return i;
	      return -1;
	   }

	   public void depthFirstSearch(){
	      //mark first node as visited
	      lstVertices[0].visited = true;
	      //display the vertex
	      displayVertex(0);   
	      //push vertex index in stack
	      stack.push(0);

	      while(!stack.isEmpty()){
	         //get the unvisited vertex of vertex which is at top of the stack
	         int unvisitedVertex = getAdjUnvisitedVertex(stack.peek());
	         //no adjacent vertex found
	         if(unvisitedVertex == -1){
	            stack.pop();
	         }else{
	            lstVertices[unvisitedVertex].visited = true;
	            displayVertex(unvisitedVertex);
	            stack.push(unvisitedVertex);
	         }
	      }

	      //stack is empty, search is complete, reset the visited flag        
	      for(int i=0;i<vertexCount;i++){
	         lstVertices[i].visited = false;
	      }        
	   }

	   public void breadthFirstSearch(){
	      //mark first node as visited
	      lstVertices[0].visited = true;
	      //display the vertex
	      displayVertex(0);   
	      //insert vertex index in queue
	      queue.insert(0);
	      int unvisitedVertex;
	      while(!queue.isEmpty()){
	         //get the unvisited vertex of vertex which is at front of the queue
	         int tempVertex = queue.remove();            
	         //no adjacent vertex found
	         while((unvisitedVertex=getAdjUnvisitedVertex(tempVertex)) != -1){    
	            lstVertices[unvisitedVertex].visited = true;
	            displayVertex(unvisitedVertex);
	            queue.insert(unvisitedVertex);               
	         }
	      }   

	      //queue is empty, search is complete, reset the visited flag        
	      for(int i=0;i<vertexCount;i++){
	         lstVertices[i].visited = false;
	      }    
	   }
	}