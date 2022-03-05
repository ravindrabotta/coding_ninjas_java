/*
****
 ****
  ****
   *****
   */

package patterns_2;
import java.util.Scanner;
public class ParallelogramPattern {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int aNumber = scan.nextInt();
        scan.close();
        
        int i = 1;
        while(i <= aNumber) {
            int spaces = i - 1;
            while(spaces >= 1) {
                System.out.print(" ");
                spaces = spaces - 1;
            }
            int j = 1;
            while(j <= aNumber) {
                System.out.print("*");
                j = j + 1;
            }            
            System.out.println();
            i = i + 1;
        }
	}
}
