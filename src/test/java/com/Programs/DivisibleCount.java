package com.Programs;

import java.util.Scanner;

public class DivisibleCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = in.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = in.nextInt();

        System.out.print("Enter the value to check for divisibility: ");
        int divisor = in.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }

        System.out.println("The number of values divisible by " + divisor + " in the range " + start + " to " + end + " is: " + count);
    }
}