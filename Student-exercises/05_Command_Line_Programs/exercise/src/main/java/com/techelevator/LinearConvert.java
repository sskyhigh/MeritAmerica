package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		int length = sc.nextInt();

		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String choice = sc.next();

		if(choice.equalsIgnoreCase("m")){
			int feet = (int) (length * 3.2808399);
			System.out.println(length + "f is " + feet + "f");
		}
		if(choice.equalsIgnoreCase("f")){
			int meter = (int) (length * 0.3048);
			System.out.println(length + "m is " + meter + "m");
		}
	}

}
