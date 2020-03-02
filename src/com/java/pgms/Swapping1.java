package com.java.pgms;

import java.util.Scanner;

//swapping 2 numbers using 3rd variable

public class Swapping1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num:");
		int a=sc.nextInt();
		System.out.println("enter 2nd num:");
		int b=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
	}

}
