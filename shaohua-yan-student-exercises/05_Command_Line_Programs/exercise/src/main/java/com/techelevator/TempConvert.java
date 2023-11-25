package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Celsius or Fahrenheit? C for celsius, F for fahrenheit");
		String choice = sc.next();

		if(choice.equalsIgnoreCase("C")){
			System.out.println("Enter a temperature");
			int cel = sc.nextInt();

			double fConversaion = (cel * 1.8) + 32;
			System.out.println(cel + "C is " + fConversaion + "F");
		}
		if(choice.equalsIgnoreCase("F")){
			System.out.println("Enter a temperature");
			int fahren = sc.nextInt();

			int celsiusConversaion = (int) ((fahren -32 ) / 1.8);
			System.out.println(fahren + "F is " + celsiusConversaion + "C");
		}
	}

}
