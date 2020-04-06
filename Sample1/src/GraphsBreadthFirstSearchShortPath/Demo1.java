package GraphsBreadthFirstSearchShortPath;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		DirectedGraph dGraph = new DirectedGraph();
		dGraph.insertVertex("1");
		dGraph.insertVertex("2");
		dGraph.insertVertex("3");
		dGraph.insertVertex("4");
		dGraph.insertVertex("5");
		dGraph.insertVertex("6");
		dGraph.insertVertex("7");
		dGraph.insertVertex("8");
		
		dGraph.insertEdge("1", "2");
		dGraph.insertEdge("1", "3");
		dGraph.insertEdge("2", "3");
		dGraph.insertEdge("2", "4");
		dGraph.insertEdge("2", "6");
		dGraph.insertEdge("3", "5");
		dGraph.insertEdge("4", "8");
		dGraph.insertEdge("4", "6");
		dGraph.insertEdge("4", "7");
		dGraph.insertEdge("5", "7");
		dGraph.insertEdge("6", "8");
		
		System.out.println("Matrix is as follows: ");
		dGraph.displayMatrix();
		
		System.out.println("Breadth First Search as follows: ");
		dGraph.bfs();
		
				

		
		
	}

}
