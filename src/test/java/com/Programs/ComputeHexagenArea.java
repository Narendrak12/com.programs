package com.Programs;

import java.util.Scanner;

public class ComputeHexagenArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of side of hexagen");
		int s=sc.nextInt();
		System.out.println("The area of hexagenside"+hexagenside(s)+"\n");

	}
	public static double hexagenside(int s) 
	{
		return((6 * (s*s))/(4*Math.tan(Math.PI)/6));
	
	}

}
