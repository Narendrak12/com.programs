package com.Programs;

import java.util.Scanner;

public class DivisionOfTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num=sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the secound number");
		int num2 =sc2.nextInt();
		
		int div = num/num2;
		System.out.println(div);
		
	}

}
