package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReturnArraySum {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];
		
		if(size == 0) {
			return input;
		}
		
		String[] strNums;
		strNums = br.readLine().trim().split("\\s");
				
		for(int i = 0; i < size; i++) {
			input[i] = Integer.parseInt(strNums[i]);
		}
		return input;
	}
	
	public static int sum(int[] arr) {
		int size = arr.length;
		int sum = 0;
		for(int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		return sum;		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int numberOfTests = Integer.parseInt(br.readLine().trim());
		
		while(numberOfTests > 0) {
			int arr[] = takeInput();
			System.out.println(ReturnArraySum.sum(arr));
			numberOfTests -= 1;
		}
	}

}
