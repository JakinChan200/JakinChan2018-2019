import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 3};
		int[] arr2 = {2, 3, 4, 5};
		int num = 2;
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		System.out.println(Arrays.toString(sum(arr1, arr2)));
		System.out.println(Arrays.toString(append(arr1, num)));
		System.out.println(Arrays.toString(remove(arr1, num)));
		System.out.println(sumEven(arr1));
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {	
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += arr2[i];
		}
		return arr1;
	}
	
	public static int[] append(int[] arr, int num) {
		int[] tempArray = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			tempArray[i] = arr[i];
		}
		tempArray[tempArray.length-1] = num;
		return tempArray;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] tempArray = new int[arr.length-1];
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != idx) {
				tempArray[counter] = arr[i];
				counter++;
			}
		}
		return tempArray;
	}
	
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	public static void rotateRight(int[] arr) {
		int lastValue = arr[arr.length-1];
		for(int i = arr.length-1; i >= 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = lastValue;
	}
}
