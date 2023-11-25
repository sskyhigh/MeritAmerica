package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        int prev1 = 0;
        int prev2 = 1;
        int current = 1;

        while (current <= n) {
            System.out.print(prev1);

            System.out.print(", ");
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
    }
}
