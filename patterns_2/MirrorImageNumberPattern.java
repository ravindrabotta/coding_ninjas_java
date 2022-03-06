package patterns_2;

import java.util.Scanner;

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber  =  scan.nextInt();
		scan.close();
		
		int i = 1;
		while(i <= aNumber) {
			int spaces = 1;
			while(spaces <= aNumber - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		
        i = 1;
        while(i <= aNumber) {
            int spaces = 1;
            while(spaces <= aNumber - i) {
                System.out.print(" ");
                spaces = spaces + 1;
            }
            int j = 1;
            while(j <= i) {
                System.out.print(j);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
	}
}
