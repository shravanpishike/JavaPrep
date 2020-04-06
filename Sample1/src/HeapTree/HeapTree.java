package HeapTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HeapTree {
Node root;
public HeapTree() {
	root = null;
}




public void displayTree() {
	displayTree(root,0);
	System.out.println();
}


private void displayTree(Node p, int level) {

	int i;
	if(p==null) 
		return;
	
	displayTree(p.rChild,level+1);
	System.out.println();
	for(i=0;i<level;i++)
		System.out.print("   ");
		System.out.print(p.info);

		displayTree(p.lChild,level+1);
	
}


public void createBinaryTree() {
	int i,n,data;		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number of nodes :");
	n = scan.nextInt();
	
	if(n ==0)
		return;
	for(i=1;i<=n;i++) {
		System.out.print("Enter the element to be inserted :");
		data = scan.nextInt();
		insertHeapTree(data);
	
	
}

}


public void insertHeapTree(int data) {

    Node newNode = new Node(data);

    if (root == null) {
        root = newNode;
        return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

        Node n = queue.remove();

        if (n.lChild == null) {        	
            n.lChild = newNode;
            break;
        } else {
            queue.add(n.lChild);
        }

        if (n.rChild == null) {
            n.rChild = newNode;
            break;
        } else {
            queue.add(n.rChild);
        }

    }
	
    
 		
	
}

}
