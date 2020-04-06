package Sorting;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		Sorting sort = new Sorting(scan.nextInt());
		sort.createArray();

		while (true) {

			System.out.println("Which sorting technique you want to use to sort the array ?");
			System.out.println("1.Bubble Sort");
			System.out.println("2.Insertion Sort");
			System.out.println("3.Selection Sort");
			System.out.println("4.Merge Sort");
			System.out.println("5.Quick Sort");
			switch (scan.nextInt()) {
			case 1:
				sort.BubbleSort();
				break;
			case 2:
				sort.InsertionSort();
				break;
			case 3:
				sort.SelectionSort();
				break;

			case 4:
				sort.MergeSort();
				break;

			case 5:
				sort.QuickSort();
				break;
			}
		}

	}
}
