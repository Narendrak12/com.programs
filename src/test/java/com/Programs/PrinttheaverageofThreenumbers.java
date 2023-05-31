package com.Programs;

import java.util.Scanner;

public class PrinttheaverageofThreenumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num=sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the secound number");
		int num2=sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the thrid number");
		int num3= sc3.nextInt();
		int average =num+num2+num3/3;
		System.out.println(average);
		

	}

}
