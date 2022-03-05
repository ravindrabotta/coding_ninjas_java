/*
Issues with this code
1. Repetitive - you make one mistake, it gets carry forwarded every where.
2. Readability -  same code has to be read multiple times.
3. Testability - although same logic, it has to be tested as many times as it is written.
*/

package functions;

import java.util.Scanner;

public class CalculatingNcR {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		scan.close();
		
		int factN = 1;
		for(int i = 1; i <= n; i++) {
			factN = factN * i;
		}
		
		int factR = 1;
		for(int i = 1; i <= r; i++) {
			factR = factR * i;
		}
		
		int factNR = 1;
		for(int i = 1; i <= n - r; i++) {
			factNR = factNR * i;
		}
		
		System.out.print(factN / (factR * factNR));
	}
}
