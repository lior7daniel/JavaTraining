package DataStructure;

import java.util.Arrays;

public class Sort {

	public static void swap(int[] arr, int i, int j) {
		int temp	= arr[i];
		arr[i] 		= arr[j];
		arr[j] 		= temp;
	}

	public static int[] selectionSort(int arr[]) {
		int sortedArr[]	= arr.clone();
		
		for (int i = 0; i < sortedArr.length-1; i++) {
			int min_idx	= i;
			for (int j = i+1; j < sortedArr.length; j++) {
				if (sortedArr[j] < sortedArr[min_idx]) min_idx = j;
			}
			swap(sortedArr, min_idx, i);
		}
		
		return sortedArr;
	}

	public static int[] bubbleSort(int[] arr) {
		int sortedArr[]	= arr.clone();

		for (int i = 0; i < sortedArr.length-1; i++) {
			for (int j = 0; j < sortedArr.length-i-1; j++) {
				if(sortedArr[j] > sortedArr[j+1]) swap(sortedArr, j, j+1);
			}
		}
		
		return sortedArr;
	}

	public static int[] insertionSort(int arr[]) {
		int[] sortedArr	= arr.clone();
		
		for (int i = 1; i < sortedArr.length; ++i) {
			for (int j = i; j > 0 && sortedArr[j] < sortedArr[j-1] ; j--) {
				swap(sortedArr, j, j-1);
			}
		}
		
		return sortedArr;
	}

	
	public static void main(String[] args) {

		int arr[] = {64, 34, 25, 12, 22, 11, 90};

		System.out.println("UNSORTED ARRAY		=>	"	+	Arrays.toString(arr) + "\n");

		System.out.println("Selection	sort	=>	"	+	Arrays.toString(selectionSort(arr)));
		System.out.println("Bubble 		sort 	=>	"	+	Arrays.toString(bubbleSort(arr)));
		System.out.println("Insertion 	sort 	=>	" 	+ 	Arrays.toString(insertionSort(arr)));

		
	}
}
