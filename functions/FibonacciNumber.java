package functions;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		System.out.println(checkNumber(aNumber));
	}
	
	public static boolean checkNumber(int aNumber) {
		int last = 1;
		int prevLast = 0;
		boolean isFibonacci = false;
		if (aNumber == 0 || aNumber == 1) return true;
		for(; prevLast <= aNumber; ) {
			int current = last + prevLast;
			System.out.println(current + " " + last + " " + prevLast);
			if(current == aNumber) {
				isFibonacci = true;
				return isFibonacci;
			}
			prevLast = last;
			last = current;
		}
		return isFibonacci;
	}
}
