package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNumbersInArray {

	public static void arrange(int[] arr, int n) {
		// Your code goes here
		int j = 0;
		for (int i = 0; i <= n / 2; i++) {
			if (i == n - 1 - i)
				arr[i] = j + 1;
			else if (!(i > n - 1 - i)) {
				arr[i] = j + 1;
				arr[n - 1 - i] = j + 2;
				j = arr[n - 1 - i];
			}
		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			ArrangeNumbersInArray.arrange(arr, n);
			printArray(arr);

			t -= 1;
		}
	}

}
