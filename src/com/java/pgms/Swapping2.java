package com.java.pgms;

//swapping 2 numbers without using 3rd variable

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num:");
		int a=sc.nextInt();
		System.out.println("enter 2nd num:");
		int b=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}

}
