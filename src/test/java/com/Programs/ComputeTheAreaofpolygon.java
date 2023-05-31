package com.Programs;

import java.util.Scanner;

public class ComputeTheAreaofpolygon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of slides of polygon");
		int s=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input the lenght of one side is ");
		double n=sc.nextDouble();
		System.out.println("polygan and slides and lenght of one silde is "+polygon(s,n));
		}
	 public static double polygon(int s, double n) 
	 {
		 
		System.out.println((n*(s*s))/(4*Math.tan(Math.PI/n)));
		return n;
		
		 
	 }

}
