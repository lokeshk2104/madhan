package com.java.pgms;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {

		int n,a,i=0,j=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		n=input.nextInt();
		a=n;
		while(a>0)
		{
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}

		if(n==j)
		{
			System.out.println(+j+"-is Armstrong number");
		}
		else {
			
			System.out.println("not Armstrong number");
		}
		
}

}