package GraphsBreadthFirstSearchShortPath;

public class UndirectedGraph {
public int MAX_SIZE = 20;

int n;
int e;

Vertex vertexList[];
boolean [][] adjMatrix;

public UndirectedGraph() {
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
		adjMatrix[v][u] = true;
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

}
