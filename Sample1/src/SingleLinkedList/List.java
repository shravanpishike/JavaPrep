package SingleLinkedList;

import java.util.Scanner;

public class List {
private Node start;

public List() {
	
	start = null;
}

public void insertDatainEmptyList(int data) {
	Node newNode = new Node(data);
	newNode.link = start;
	start = newNode;	
}

public void insertDataAtEnd(int data) {
	Node p;
	Node newNode = new Node(data);
	
	if(start == null) {
		start = newNode;
		return;
	}
	
	p = start;
	while (p.link != null) {
		p = p.link;
	}
	p.link = newNode;
		
}

public void insertDataAtPosition(int data, int position) {
	Node p,q;
	Node newNode = new Node(data);
	int pos2 = 1;
	p = start;
	q = start;
	while(pos2 < position) {
		q = q.link;
		if(pos2 == (position)-1) {
			newNode.link = q;
			p.link = newNode;
			break;	
		}		
			p = p.link;
			pos2++;
	}

	
}

public void createList() {
	int i,n,data;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number of nodes :");
	n = scan.nextInt();
	
	if(n ==0)
		return;
	for(i=1;i<=n;i++) {
		System.out.print("Enter the element to be inserted :");
		data = scan.nextInt();
		insertDataAtEnd(data);
	}
	
}

public void deleletAtPositionList(int position) {
	Node p,q;
	int pos2 = 1;
	p = start;
	q = start;
	while(true) {
		q = q.link;
		if(pos2 == (position)-1) {
			p.link = q.link;
			break;	
		}		
			p = p.link;
			pos2++;
	}
	
}


public void reverseList() {
	Node prev, p, next;
	prev = null;
	p = start;
	while(p!=null) {
		next = p.link;
		p.link= prev;
		prev =p;
		p = next;
	}
	start = prev;
	
}

public void displayList() {
	Node p;
	
	if (start==null)
	{
		System.out.println("List is empty");
		return;
	}
	System.out.print("List is :");
	p = start;
	while (p !=null) {
		System.out.print(p.data+" ");
		p = p.link;
	}
	System.out.println("");
}

public static void main(String args[]) 
{ 
	
	List singleList = new List();
	
	singleList.createList();
	
	singleList.displayList();
	
	singleList.insertDatainEmptyList(4);
	
	singleList.displayList();
	
	singleList.insertDataAtPosition(5, 5);
	
	singleList.displayList();
	
	singleList.deleletAtPositionList(4);
	
	singleList.displayList();
	
	singleList.reverseList();
	
	singleList.displayList();
	
}

}
