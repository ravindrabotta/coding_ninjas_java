package arrays;

import java.util.Scanner;

public class InputOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter element at " + i + "th position.");
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
