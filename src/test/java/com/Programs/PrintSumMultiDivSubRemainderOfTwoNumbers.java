package com.Programs;

import java.util.Scanner;

public class PrintSumMultiDivSubRemainderOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num=sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the secoud number");
		int num1=sc.nextInt();
		int sum = num+num1;
		int subtract =num-num1;
		int multiple= num*num1;
		int division= num/num1;
		int mod =num/num1;
		System.out.println("sum of two values is " +sum);
		System.out.println("subtract of two values is "+subtract);
		System.out.println("multiple of two values is "+multiple);
		System.out.println("division of two values is "+division);
		System.out.println("mod of two values is "+mod);
		
		
	
		
		

	}

}
