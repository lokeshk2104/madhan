package com.java.pgms;

public class Armstrong {

	public static void main(String[] args) {

		int c=0,a,temp;
		int n=153;//armstrong number
		temp=n; //used to compare
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
					}
	
		if(temp==c)
		{
			System.out.println("Armstrong number");
					}
		
		else
		{
			System.out.println("not Armstrong number");
		}
		
		
	}

}
