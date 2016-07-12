package misc;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graphs {

	public static void main(String args[]){
		Graph<Integer> myGraph = new Graph<Integer>();
	}
	
}

class Graph<T>{
	Node root;	
	ArrayList<LinkedList<T>> adjacencyList;
	
	Graph(){
		adjacencyList = new ArrayList<LinkedList<T>>();
	}
	
	void addNode(int n){
		Node newNode = new Node(n);		
	}
}

class Node{
	ArrayList<Node> links; //TODO What are the children in? Arraylist?
	int data;
	
	Node(int d){
		data = d;
	}
}
