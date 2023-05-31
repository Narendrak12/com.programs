package com.Programs;

import java.util.Scanner;

public class CompareTwonumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num=sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the second number");
		int num1=sc1.nextInt();
		if(num>num1) {
			System.out.println("Num one is greater"+num);
		}else {
			System.out.println("Num1 is Greater"+num1);
		}
		
		
	}				

	}


