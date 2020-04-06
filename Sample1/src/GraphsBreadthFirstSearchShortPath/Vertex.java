package GraphsBreadthFirstSearchShortPath;

public class Vertex {
String name;
int state;

public Vertex(String node) {
	name = node;
	state = -1;
}

public String toString() {
	return name;
	
}
}
