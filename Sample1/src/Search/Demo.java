package Search;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");		
		Search search = new Search(scan.nextInt());
		search.createArray();
		
		System.out.println("*******Linear Search**********");
		System.out.println("Enter Element to be searched: ");
		int searchElement = scan.nextInt();
		search.LinearSearch(searchElement);
		
		while(true) {
		System.out.println("*******Binary Search**********");
		System.out.println("Enter Element to be searched: ");
		int searchElement2 = scan.nextInt();
		search.BinarySearch(searchElement2);
		}
	}

}
