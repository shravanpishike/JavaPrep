package GraphsAdjacencyLinkedList;

public class DirectedGraph {
Vertex start;

public DirectedGraph() {
	start = null;
}

public void insertVertex(String vname) {
	Vertex v = new Vertex(vname);
	Vertex p;
	if(start == null) {
	start = v;
	}
	else {
		p = start;
		while(p.vlink!=null) {
			p = p.vlink;
		}
		p.vlink = v;
	}
}

public void insertEdge(String vname1, String vname2) {
	Edge e = new Edge(vname2);
	Vertex p;
	Edge pEdge = null; 
	p = start;
	while(!p.name.equals(vname1)) {
		p = p.vlink;
	}
	if(p.elink == null)
		p.elink= e;
	else {
		pEdge = p.elink;
		while(pEdge.elink!=null)
			pEdge = pEdge.elink;
	}
	pEdge.elink = e;
}



}
