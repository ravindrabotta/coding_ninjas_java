/*1=1
1+2=3
1+2+3=6
1+2+3+4=10*/

package com.org.cn.patterns_2;
import java.util.Scanner;
public class SumPattern {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int aNumber = scan.nextInt();
        scan.close();
        
        int i = 1;
        while(i <= aNumber) {
            int j = 1;
            while(j <= i) {
                System.out.print(j);
                if (j < i) System.out.print("+");
                j = j + 1;
            }
            System.out.print("=");
            j = 1;
            int sum = 0;
            while(j <= i) {
               	sum = sum + j;
                j = j + 1;
            }
            System.out.print(sum);
            System.out.println();
            i = i + 1;
        }
	}
}
