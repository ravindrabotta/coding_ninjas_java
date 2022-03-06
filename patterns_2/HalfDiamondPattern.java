/*

*
*1*
*121*
*12321*
*1234321*
*12321*
*121*
*1*
*

*/

package patterns_2;
import java.util.Scanner;
public class HalfDiamondPattern {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int aNumber = scan.nextInt();
        scan.close();
        
        int i = 1;
        int n1 = aNumber;
        int n2 = n1 - 1;
        System.out.println("*");
        while(i <= n1) {
            System.out.print("*");
            int j = 1;
            while(j <= i) {
                System.out.print(j);
                j = j + 1;
            }
            int k = i - 1;
            while(k >= 1) {
                System.out.print(k);
                k = k - 1;
            }
            System.out.print("*");
            System.out.println();
            i = i + 1;
        }
        
        i = 1;
        while(i <= n2){
            System.out.print("*");
            int j = 1;
            while(j <= n1 - i) {
                System.out.print(j);
                j = j + 1;
            }
            int k = n2 -i;
            while(k >= 1) {
                System.out.print(k);
                k = k - 1;
            }
            System.out.print("*");
            System.out.println();
            i = i + 1;
        }
        System.out.print("*");
    }
}