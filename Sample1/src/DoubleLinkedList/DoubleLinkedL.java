package DoubleLinkedList;

import java.util.Scanner;

public class DoubleLinkedL {
	private Node start;

public DoubleLinkedL() {
		
		start = null;
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

	private void insertDataAtEnd(int data) {
		Node p;
		Node newData = new Node(data);
		
		if(start == null) {
			start =  newData;
			return;
		}
		p = start;
		 while(p.next!=null) {
			p = p.next;
		 }		
			p.next = newData;
			newData.prev = p;
			newData.next = null;
	}

	public void reverseList() {
		Node p1, p2;
		p1 = start;
		p2 = p1.next;
		p1.next = null;
		p1.prev= p2;
		while(p2!=null) {			
			p2.prev = p2.next;
			p2.next =p1;
			p1=p2;
			p2 = p2.prev;
		}
		start = p1;
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
			p = p.next;
		}
		System.out.println("");
	}
	
	
}
