package functions;

import java.util.Scanner;

public class CalculatingNcRWithFunctions {
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		scan.close();
		
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n - r);
		
		System.out.print(factN / (factR * factNR));	
	}
}
