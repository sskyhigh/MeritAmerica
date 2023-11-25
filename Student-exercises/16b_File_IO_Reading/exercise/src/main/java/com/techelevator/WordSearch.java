package com.techelevator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch(); wordSearch.run();
    }

    public void run() {
        /* Your code goes here */
        try (userInput) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the fully qualified name of the file that should be " +
                    "searched?");
            String filePath = scanner.nextLine();
            System.out.println("What is the search word you are looking for?");
            String searchWord = scanner.nextLine();
            System.out.println("Should the search be case sensitive? (Y\\N)");
            String caseSensitive = scanner.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line; int lineNumber = 1; while ((line = br.readLine()) != null) {
                    if (caseSensitive.equalsIgnoreCase("Y")) {
                        if (line.contains(searchWord)) {
                            System.out.println(lineNumber + ") " + line);
                        }
                    } else {
                        if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                            System.out.println(lineNumber + ") " + line);
                        }
                    } lineNumber++;
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
            }
        }
    }
}
