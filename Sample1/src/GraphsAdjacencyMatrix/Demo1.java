package GraphsAdjacencyMatrix;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		DirectedGraph dGraph = new DirectedGraph();
		dGraph.insertVertex("v1");
		dGraph.insertVertex("v2");
		dGraph.insertVertex("v3");
		
		dGraph.insertEdge("v1", "v2");
		dGraph.insertEdge("v2", "v3");
		
		
		System.out.println("Matrix is as follows: ");
		dGraph.displayMatrix();
		
		System.out.println("Out degree of v1: "+dGraph.outDegree("v1"));
		System.out.println("In degree of v2: "+dGraph.inDegree("v2"));
		System.out.println("Degree of v2: "+(dGraph.outDegree("v2") + dGraph.inDegree("v2")));
		
		dGraph.deleteEdge("v2", "v3");
		System.out.println("Matrix after deletion is as follows: ");
		dGraph.displayMatrix();

		System.out.println("**********Undirected Graph****");
		UndirectedGraph undGraph = new UndirectedGraph();
		undGraph.insertVertex("v1");
		undGraph.insertVertex("v2");
		undGraph.insertVertex("v3");
		
		undGraph.insertEdge("v1", "v2");
		undGraph.insertEdge("v2", "v3");
		
		
		System.out.println("Matrix is as follows: ");
		undGraph.displayMatrix();
		
		
	}

}
