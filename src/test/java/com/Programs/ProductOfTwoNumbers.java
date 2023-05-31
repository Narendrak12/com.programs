package com.Programs;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int num2 =sc.nextInt();
		int product =num*num2;
		int product2= num+num2;
	    System.out.println(product);
		System.out.println(product2);
	}

}
