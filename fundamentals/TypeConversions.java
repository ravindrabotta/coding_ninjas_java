package com.org.cn.fundamentals;

public class TypeConversions {
	
	public static void main(String[] args) {
		char ch = 'a';
		int i = ch;   // implicit conversion 2 bytes -> 4 bytes
		ch = (char)i; // explicit conversion 4 bytes -> 2 bytes
	//	ch = ch + 1; // throws error as code will evaluate to larger bytes here int 
					//	and we are assigning to char
		double a = 6 / 4;
        int b  = 6 / 4;
        double c = a + b;
        System.out.println(a+ "   " + b +"    "+ c);
	}

}
