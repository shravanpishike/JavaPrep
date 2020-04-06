package CircularLinkedList;

import java.util.Scanner;

public class CircularLinkedL {

	private Node last;
	
	
	
	public CircularLinkedL() {
	
		last = null;
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
		
		Node newData = new Node(data);
		if(last == null) {
			last = newData;
			last.link = last;		
		}
		else {
			newData.link = last.link;
			last.link = newData;
			last = newData;
		}
		
	}


	public void displayList() {
		Node p;
		
		if (last==null)
		{
			System.out.println("List is empty");
			return;
		}
		System.out.print("List is :");
		p = last;
		do {
			System.out.print(p.data+" ");
			p = p.link;
		}while(p != last);
		System.out.println("");
	}
}
