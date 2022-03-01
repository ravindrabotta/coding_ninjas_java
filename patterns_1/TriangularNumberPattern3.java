package com.org.cn.patterns_1;

import java.util.Scanner;

public class TriangularNumberPattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int i = 1;
		while(i <= aNumber) {
			int j = 1;
			int p = i;
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
