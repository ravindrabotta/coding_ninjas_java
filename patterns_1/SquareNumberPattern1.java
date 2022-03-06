package patterns_1;

import java.util.Scanner;

public class SquareNumberPattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int i = 1;
		while(i <= aNumber) {
			int j = 1;
			while(j <= aNumber) {
				System.out.print(i + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
