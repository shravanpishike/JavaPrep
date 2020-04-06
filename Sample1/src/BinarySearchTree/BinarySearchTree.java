package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {
Node root;
public BinarySearchTree() {
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
public void insert(int data) {
	Node newNode = new Node(data);
	Node p = root;
	Node par = null;
	while(p!=null) {
		par = p;
	if(data < p.info) {
		p = p.lChild;
	}else if(data > p.info) {
		p = p.rChild;
	}else {
		System.out.println("Duplicate element");
		return;
	}
	}
		
	if(par == null) {
		root = newNode;
	}else if (data < par.info)
		par.lChild = newNode;
		else 
			par.rChild = newNode;
	
	
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
public void search(int i) {
	
	search(root,i);

}
private void search(Node p, int i) {
	if(p.info == i)
		System.out.println("Search successful");
	else if (i < p.info )
	search(p.lChild,i);
	else if (i > p.info)
		search(p.rChild,i);
}
public void min() {
	Node p;
	p = root;
	//par = null;
	while(p!=null) {
	//	par = p;		
		if(p.lChild == null) {
			System.out.println("Minimum element is "+p.info);		
			break;
		}
		p = p.lChild;
	}
	
}
public void max() {
	Node p ,par;
	p = root;
	par = null;
	while(p!=null) {
		//par = p;
		if(p.rChild == null) {
			System.out.println("Maximum element is "+p.info);
			break;
		}
		p =  p.rChild;
	}
	
}


}
