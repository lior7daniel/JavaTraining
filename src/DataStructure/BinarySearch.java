package DataStructure;

public class BinarySearch {

	public static int recursiveBinarySearch(int[] arr, int key, int beginIndex, int endIndex) {
		if(beginIndex <= endIndex) {
			int midIndex = (beginIndex + endIndex) / 2;
			if(key == arr[midIndex]) return midIndex;
			if(key < arr[midIndex]) return recursiveBinarySearch(arr, key, beginIndex, midIndex-1);
			return recursiveBinarySearch(arr, key, midIndex+1, endIndex);
		}
		return -1;
	}
	
	public static int iterativBinarySearch(int[] arr, int key) {
		int beginIndex = 0, endIndex = arr.length;
		while(beginIndex <= endIndex) {
			int midIndex = (beginIndex + endIndex) / 2;
			if(key == arr[midIndex]) return midIndex;
			if(key < arr[midIndex]) endIndex = midIndex-1;
			else beginIndex = midIndex+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 10, 40 };

        System.out.println(recursiveBinarySearch(arr, 5, 0, arr.length-1));
        System.out.println(iterativBinarySearch(arr, 5));

	}

}
