package patterns_1;

import java.util.Scanner;

public class TriangularNumberPattern2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber =  scan.nextInt();
		scan.close();
		
		int i = 1;
		int p = 1;
		while(i <= aNumber) {
			int j = 1;
			while(j <= i) {
				System.out.print(p + " ");
				p = p + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
