package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LinearSearch {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];
		
		if(size == 0) return input;
		
		String[] strNums;
		strNums = br.readLine().trim().split("\\s");
		
		for(int i = 0; i < size; i++) {
			input[i] = Integer.parseInt(strNums[i]);
		}
		return input;
	}
	
	public static int linearSearch(int[] input, int aNumber) {
		int size = input.length;
		for(int i = 0; i < size; i++) {
			if(input[i] == aNumber) return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) throws IOException {
		int numberOfTests = Integer.parseInt(br.readLine().trim());
		
		while(numberOfTests > 0) {
			int[] input = takeInput();
			int aNumber = Integer.parseInt(br.readLine().trim());
			System.out.println(LinearSearch.linearSearch(input, aNumber));
			numberOfTests -= 1;
		}
	}
}
