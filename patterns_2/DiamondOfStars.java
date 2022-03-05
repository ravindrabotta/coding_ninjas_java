/*
 Use only odd nos
 
  *
 ***
*****
 ***
  *
 
 */




package patterns_2;
import java.util.Scanner;
public class DiamondOfStars {
    
    public static void main(String[] args) {
        // Write your code here
    	Scanner scan = new Scanner(System.in);
        int aNumber = scan.nextInt();
        scan.close();
        
        int i = 1;
        int n1 = (aNumber + 1)/2;
        int n2 = aNumber - n1;
        while(i <= n1){
            int spaces = 1;
            while(spaces <= n1 - i) {
                System.out.print(" ");
                spaces = spaces + 1;
            }
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j = j + 1;
            }
            int k = i - 1;
            while(k >= 1) {
                System.out.print("*");
                k = k - 1;
            }
       		System.out.println();
            i = i + 1;
        }
        i = 1;
        while(i <= n2) {
            int spaces = 1;
            while(spaces <= i) {
                System.out.print(" ");
                spaces = spaces + 1;
            }
            int j = 1;
            while(j <= n2 - i + 1) {
                System.out.print("*");
                j = j + 1;
            }
            int k = n2 - i;
            while(k >= 1) {
                System.out.print("*");
                k = k - 1;
            }
            System.out.println();
            i = i + 1;
        }   
    }
}