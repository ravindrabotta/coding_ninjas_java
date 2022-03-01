package com.org.cn.patterns_2;

import java.util.Scanner;

public class InvertedTriangleStarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		scan.close();
		
		int i = 1;
		while(i <= aNumber) {
			int j = 1;
			while(j <= aNumber - i + 1) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
