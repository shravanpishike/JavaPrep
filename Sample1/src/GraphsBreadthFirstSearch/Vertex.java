package GraphsBreadthFirstSearch;

public class Vertex {
String name;
int state;
String pred;
int distance;

public Vertex(String node) {
	name = node;
	state = -1;
	pred = "0";
	distance = 0;
}

public String toString() {
	return name;
	
}
}
