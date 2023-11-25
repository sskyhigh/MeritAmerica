package com.techelevator;
import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int weightA, weightB, weightC = 0;

        System.out.println("Enter a series of weights (space-separated): "); weightA = sc.nextInt();
        weightB = sc.nextInt(); weightC = sc.nextInt();

        calculateMartianWeight(weightA, weightB, weightC);
    }

    public static void calculateMartianWeight(int weightA, int weightB, int weightC) {
        int formula1 = (int) ((int) weightA * 0.378); int formula2 = (int) ((int) weightB * 0.378);
        int formula3 = (int) ((int) weightC * 0.378);

        System.out.println(weightA + " lbs. on earth is " + formula1 + " lbs. on mars");
        System.out.println(weightB + " lbs. on earth is " + formula2 + " lbs. on mars");
        System.out.println(weightC + " lbs. on earth is " + formula3 + " lbs. on mars");
    }
}
