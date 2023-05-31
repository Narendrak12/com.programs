package com.Programs;

import java.util.Scanner;

public class ComputeTheIntergerNumbers {

	
		public static void main(String[] args) 
		{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num=sc.nextInt();
		System.out.println("the sum of the dights"+Demo(num));
		
		} 
		public static int Demo(int num) 
		{
			 int sum =0 ;
			      while(num!=0) 
			      {
					sum+= num%10;
					    num=num/10;
					    
				}
				return sum;
			}
			
		

}
