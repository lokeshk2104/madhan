package com.java.pgms;

public class Ascending {

	public static void main(String[] args) {

		int temp;
		int a[]={10,100,200,40,20};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
					
			}
			
			}
		System.out.println("ascending order");
		
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[j]);
			
		}
		
		

}
}
