package com.Programs;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		char[] a=sc.nextLine().toCharArray();
		System.out.println("Revere the String");
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}

}
