package functions;

import java.util.Scanner;

public class FarenheitToCelsiusTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		int step = scan.nextInt();
		scan.close();
		printFarenheitTable(start, end, step);
	}
	
	public static void printFarenheitTable(int start, int end, int step) {
		for(int i = start; i <= end; i += step) {
			int celsius = (int)((5.0/9) * (i - 32));
			System.out.println(i + "\t" + celsius);
		}
	}
}
