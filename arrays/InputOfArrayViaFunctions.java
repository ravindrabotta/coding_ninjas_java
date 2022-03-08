package arrays;

import java.util.Scanner;

public class InputOfArrayViaFunctions {
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] takeInput() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[5];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the element at " + i + "th position.");
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		printArray(arr);
	}
}
