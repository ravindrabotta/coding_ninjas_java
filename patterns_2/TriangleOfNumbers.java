/*
   1
  232
 34543
4567654
  
 */

package patterns_2;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		/*
		 * Your class should be named Solution. Read input as specified in the question.
		 * Print output as specified in the question.
		 */
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();

		int i = 1;
		while (i <= aNumber) {
			int spaces = 1;
			while (spaces <= aNumber - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			int j = 1;
			int p = i;
			while (j <= i) {
				System.out.print(p);
				p = p + 1;
				j = j + 1;
			}
			int k = i - 1;
			p = p - 2;
			while (k >= 1) {
				System.out.print(p);
				p = p - 1;
				k = k - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
