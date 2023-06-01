package com.Programs;

import java.util.Scanner;

public class SumisequaltoThridvariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int num=sc.nextInt();
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the secound value");
		int num2=sc2.nextInt();
		Scanner sc3= new Scanner(System.in);
		System.out.println("Enter the Thrid value");
		int num3 = sc3.nextInt();
		int sum=num+num2;
		if(sum==num3) {
			System.out.println("It is true");
		}else
			System.out.println("It is false");

	}

}
