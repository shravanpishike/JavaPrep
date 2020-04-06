package GraphsBreadthFirstSearchShortPath;

import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraph {
public int MAX_SIZE = 20;
public final int INITIAL_STATE = -1;
public final int WAITING = 0;
public final int VISITED = 1;
int n;
int e;

Vertex vertexList[];
boolean [][] adjMatrix;

public DirectedGraph() {
	vertexList= new Vertex[MAX_SIZE];
	adjMatrix = new boolean[MAX_SIZE][MAX_SIZE];
}

public void insertVertex(String name) {
	vertexList[n++] = new Vertex(name);
}

public int getIndex(String name) {
	
	for(int i= 0;i<n;i++) {
	if(vertexList[i].name.equals(name))
	return i;
	}
	return -1;
	
}

public void edgeExists(String s1, String s2) {
	int u = getIndex(s1);
	int v = getIndex(s2);
	
	if(adjMatrix[u][v] == true)
		System.out.println("Edge already exists");
	else
		System.out.println("Edge doesn't exists");
}

public void deleteEdge(String s1, String s2) {
	int u = getIndex(s1);
	int v = getIndex(s2);
	
	if(adjMatrix[u][v] == true) {
		adjMatrix[u][v] = false;
		e--;
	}else
		System.out.println("Edge doesn't exists");
}

public int outDegree(String s1) {
	int u = getIndex(s1);
	int outDegree = 0;
	for(int i = 0;i<n;i++) {
		if(adjMatrix[u][i] == true)
			outDegree++;
	}
	return outDegree;
	
}

public int inDegree(String s1) {
	int u = getIndex(s1);
	int inDegree = 0;
	for(int i = 0;i<n;i++) {
		if(adjMatrix[i][u] == true)
			inDegree++;
	}
	return inDegree;
	
}

public void insertEdge(String s1, String s2) throws Exception {
	int u = getIndex(s1);
	int v = getIndex(s2);
	
	if(u==v)
		throw new Exception("Not a valid Edge");
	if(adjMatrix[u][v] == true)
		throw new Exception("Edge already exists");
	else {
		adjMatrix[u][v] = true;
		e++;
	}
	
}

public void displayMatrix() {
	for(int i=0;i<n;i++) {
		
		for(int j=0; j<n;j++) {
			if(adjMatrix[i][j] == true)
				System.out.print("1 ");
			else if(adjMatrix[i][j] == false)
				System.out.print("0 ");
			
		}
		System.out.println("");
	}
	
}



public void bfs() {
	
Queue<Vertex> bfsQ = new LinkedList<Vertex>();
bfsQ.add(vertexList[0]);
vertexList[0].state = WAITING;
visit(bfsQ);
	
}

private void visit(Queue<Vertex> bfsQ) {
	Vertex temp = bfsQ.poll();
	int i;
	if(temp!= null) {
	if(temp.state == WAITING) {
		temp.state = VISITED;
		System.out.print(temp.name);	
		i = getIndex(temp.name);
		for(int j = 0;j<n;j++) {

			if(adjMatrix[i][j] && vertexList[j].state == INITIAL_STATE) {
					vertexList[j].state = WAITING;
					bfsQ.add(vertexList[j]);					
				
			}
		}
		visit(bfsQ);
		
	}
	}else
		return;

}

}
