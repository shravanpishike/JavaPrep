package Sorting;

import java.util.Scanner;

public class Sorting {
	int a[];
	int b[];
	int c[];

	public Sorting() {
		a = new int[10];
		b = new int[10];
		c = new int[10];
	}

	public Sorting(int max_size) {
		a = new int[max_size];
		b = new int[max_size];
		c = new int[max_size];
	}

	public void createArray() {
		int i, n, data;

		Scanner scan = new Scanner(System.in);
		// System.out.print("Enter the number of nodes :");
		n = a.length;

		if (n == 0)
			return;
		for (i = 0; i < n; i++) {
			System.out.print("Enter the element to be inserted :");
			data = scan.nextInt();
			a[i] = data;
		}

	}

	public void BubbleSort() {
		int temp;
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b.length - 1; j++) {
				if (b[j] > b[j + 1]) {
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}

		System.out.println("Array after sorting is as follows: ");
		for (int x = 0; x < b.length; x++)
			System.out.println(b[x]);

	}

	public void InsertionSort() {
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		for (int i = 1; i < b.length; i++) {
			int temp = b[i];
			for (int j = i - 1; j >= 0 && temp < b[j]; j--) {
				b[j + 1] = b[j];
				b[j] = temp;
			}
		}

		System.out.println("Array after sorting is as follows: ");
		for (int x = 0; x < b.length; x++)
			System.out.println(b[x]);
	}

	public void SelectionSort() {
		// int k;
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		for (int i = 0; i < b.length; i++) {
			int k = 0;
			int temp = b[i];
			for (int j = i + 1; j < b.length; j++) {
				if (temp > b[j]) {
					temp = b[j];
					k = j;
				}
			}
			if (k != 0) {
				b[k] = b[i];
				b[i] = temp;
			}
		}

		System.out.println("Array after sorting is as follows: ");
		for (int x = 0; x < b.length; x++)
			System.out.println(b[x]);
	}

	public void MergeSort() {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		MergeSort(b);
		System.out.println("Array after sorting is as follows: ");
		for (int x = 0; x < b.length; x++)
			System.out.println(b[x]);
	}

	private void MergeSort(int[] b) {
		int n = b.length;
		if (n < 2)
			return;
		else {
			int mid = n / 2;
			int left[] = new int[mid];
			int right[] = new int[n - mid];
			for (int i = 0; i < mid; i++)
				left[i] = b[i];

			for (int i = mid; i < n; i++)
				right[i - mid] = b[i];

			MergeSort(left);
			MergeSort(right);

			Merge(left, right, b);
		}
	}

	private void Merge(int[] left, int[] right, int[] b) {
		int i, j, k;
		i = j = k = 0;
		int nL = left.length;
		int nR = right.length;
		while (i < nL && j < nR) {
			if (left[i] < right[j]) {
				b[k] = left[i];
				i++;
			} else {
				b[k] = right[j];
				j++;
			}
			k++;
		}
		if (i >= nL) {
			for (int l = j; l < nR; l++) {
				b[k] = right[l];
				k++;
			}
		} else {
			for (int l = i; l < nL; l++)
				b[k] = left[l];
			k++;
		}
	}

	public void QuickSort() {
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		
		QuickSort(b,0,b.length-1);
		
		System.out.println("Array after quick sorting is as follows: ");
		for (int x = 0; x < b.length; x++)
			System.out.println(b[x]);
		
	}

	private void QuickSort(int[] b, int start, int end) {
		int pivotIndex;
		if(start<end) {
		pivotIndex = partition(b,start,end);
		QuickSort(b,start,pivotIndex-1);
		QuickSort(b,pivotIndex+1,end);
		}
	}

	private int partition(int[] b, int start, int end) {
		int pivotIndex, pivot;
		pivotIndex = start;
		pivot = b[end];
		for(int i = start;i<end;i++) {
			if(b[i] <= pivot) {
				if (i!=pivotIndex) 
					swap(i,pivotIndex);	
				pivotIndex ++;
			}
		}
		swap(pivotIndex, end);
		return pivotIndex;
	}

	private void swap(int x, int y) {
		int temp;
		temp = b[x];
		b[x] = b[y];
		b[y] = temp;
	}



}
