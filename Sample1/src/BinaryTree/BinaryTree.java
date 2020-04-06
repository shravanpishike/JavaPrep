package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
private Node root;

public BinaryTree() {
	root = null;
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
		insert(data);
	}
	
}

// Find the 1st null element based on BFS to shove the new guy in. This will ensure the tree is always trying to be a complete binary tree. This is a modified implementation of the method 'levelOrder'.

public void insert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node n = queue.remove();

            if (n.pleft == null) {
                n.pleft = newNode;
                break;
            } else {
                queue.add(n.pleft);
            }

            if (n.pright == null) {
                n.pright = newNode;
                break;
            } else {
                queue.add(n.pright);
            }

        }
    }

public void displayTree() {
	displayTree(root,0);
	System.out.println();
}


private void displayTree(Node p, int level) {

	int i;
	if(p==null) 
		return;
	
	displayTree(p.pright,level+1);
	System.out.println();
	for(i=0;i<level;i++)
		System.out.print("   ");
		System.out.print(p.info);

		displayTree(p.pleft,level+1);
	
}

public void preorder() {
	preorder(root);
System.out.println();
}



private void preorder(Node p) {
	if(p==null)
		return;
	
	System.out.println(p.info);
	preorder(p.pleft);
	preorder(p.pright);
				
				
	
}


public void inorder() {
	inorder(root);
	System.out.println();
	
}

private void inorder(Node p) {

	if(p==null)
		return;
	
	inorder(p.pleft);
	System.out.print(p.info+" ");
	inorder(p.pright);
	
}

}
