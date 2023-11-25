package com.techelevator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FizzWriter {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FizzWriter fizzWriter = new FizzWriter(); fizzWriter.run();
    }

    public void run() {
        /* Your code goes here */
        System.out.println("What is the destination file that you want to write this?");
        String output = userInput.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            for (int i = 1; i <= 300; ++i) {
                if (i % 3 == 0 && i % 5 == 0) {
                    writer.write("FizzBuzz");
                } else if (i % 3 == 0) {
                    writer.write("Fizz");
                } else if (i % 5 == 0) {
                    writer.write("Buzz");
                } else {
                    // converts this to string, because putting
                    // i did not work
                    writer.write(Integer.toString(i));
                } writer.newLine();
            }
            // closes the writer
            writer.close();
        } catch (IOException e) {
            System.out.println("Invalid file path.");
        }
    }

}
