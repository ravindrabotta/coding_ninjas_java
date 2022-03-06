package functions;

import java.util.Scanner;

public class MoreOnFunctions {

	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static void printEvenNumbers(int a, int b) {
		for(int i = a; i <= b; i+=2) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		System.out.println(sum(a, b));
	}
}
