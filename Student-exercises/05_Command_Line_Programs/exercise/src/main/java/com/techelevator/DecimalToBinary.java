package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        decimal(number);
    }

    public static void decimal(int n) {
        int[] binary = new int[40];
        int index = 0;
        while (n > 0) {
            binary[index] = n % 2;
            n = n / 2;
            ++index;
        }
        for(int j = index - 1; j >=0;--j){
            System.out.print(binary[j]);
        }
    }
}