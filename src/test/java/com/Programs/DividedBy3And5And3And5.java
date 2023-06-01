package com.Programs;

public class DividedBy3And5And3And5 {

	public static void main(String[] args) {
		System.out.println("\nDivide by 3");
		for(int i=0;i<100;i++) {
			if(i%3==0) 
				System.out.print(i+",");
			
		}
			System.out.println("\nDivide by 5");
			for(int i1=0;i1<100;i1++) {
				if(i1%5==0) 
					System.out.print(i1+",");
				
			}
			System.out.println("\nDivide by 3 and 5");
			for(int i2=0;i2<100;i2++) {
				if(i2%3==0&&i2%5==0) 
					System.out.print(i2+",");
				
			}
			}
			
		

	}


