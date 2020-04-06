package Search;

import java.util.Scanner;

public class Search {
int a [];

public Search() {
	a = new int[10];	
}
public Search(int max_size) {
	a = new int[max_size];	
}

public void LinearSearch(int searchElement) {
	for(int i=0;i<a.length;i++){
			if(a[i] == searchElement) {
				System.out.println("Element found at index: "+i);
			return;
			}
		}
	
	System.out.println("Element not in the array");
}

public void BinarySearch(int searchElement) {
				BinarySearch(0,a.length-1,searchElement);

}

private void BinarySearch(int i, int j, int searchElement) {
	int mid = (i + j)/2;
	if (mid < i || mid > j) {	
			System.out.println("Element not found in the array");
			return;
	}
	if(searchElement == a[mid]) {
		System.out.println("Element found at index: "+mid);
		return;
	}else if (searchElement < a[mid])	
			BinarySearch(i,mid-1, searchElement);
		else if (searchElement > a[mid])	
			BinarySearch(mid+1,j,searchElement);
	
	
}
public void createArray() {
	int i,n,data;
	
	Scanner scan = new Scanner(System.in);
	//System.out.print("Enter the number of nodes :");
	n = a.length;
	
	if(n ==0)
		return;
	for(i=0;i<n;i++) {
		System.out.print("Enter the element to be inserted :");
		data = scan.nextInt();
		a[i] = data;
	}
	
}


}
