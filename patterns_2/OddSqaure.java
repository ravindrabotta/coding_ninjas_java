/*1357
3571
5713
7135*/

package patterns_2;

import java.util.Scanner;
public class OddSqaure {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int aNumber = scan.nextInt();
        scan.close();
        
        int i = 1;
        int p = i;
        while(i <= aNumber) {
            int j = 1;
            while(j <= aNumber - i + 1) {
              	System.out.print(p);
                p = p + 2;
               	j = j + 1;
            }
            int k = i - 1;
            int q = 1;
            while(k >= 1) {
                System.out.print(q);
                q = q + 2;
                k = k - 1;
        	}
            System.out.println();
            p = p - 2 * (aNumber - i);
            i = i + 1;
        }
	}
}
