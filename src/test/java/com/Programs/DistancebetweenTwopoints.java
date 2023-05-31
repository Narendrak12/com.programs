package com.Programs;

import java.util.Scanner;

public class DistancebetweenTwopoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the latitude of coordinate 1:");
		double lat =sc.nextDouble();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Input the longitude of coordinate 1:");
		double log =sc1.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Input the latitude of coordinate 2:");
		double lat2=sc2.nextDouble();
		Scanner sc3= new Scanner(System.in);
		System.out.println("Input the longitude of coordinate 2:");
		double log2=sc3.nextDouble();
        System.out.println("distance between two points :"+ distancebetweentwopoints(lat,log,lat2,log2)+ "\n");
	}
	 public static double distancebetweentwopoints(double lat,double log, double lat2,double log2)
	 {
		 lat= Math.toRadians(lat);
		 lat2=Math.toRadians(lat2);
		 log =Math.toRadians(log);
		 log2=Math.toRadians(log2);
		 
		 double earthradius= 6371.01;
		 return earthradius * Math.acos(Math.sin(lat)*Math.sin(lat2) + Math.cos(log)*Math.cos(log2)*Math.cos(lat - log2));
	 }
       
}
