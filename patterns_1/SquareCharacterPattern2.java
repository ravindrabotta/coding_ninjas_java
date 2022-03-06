package patterns_1;

import java.util.Scanner;

public class SquareCharacterPattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int i = 1;
		while(i <= aNumber) {
			int j = 1;
			char ch = (char)('A' + i - 1);
			while(j <= aNumber) {
				System.out.print((char)(ch + j - 1));
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}	
}
