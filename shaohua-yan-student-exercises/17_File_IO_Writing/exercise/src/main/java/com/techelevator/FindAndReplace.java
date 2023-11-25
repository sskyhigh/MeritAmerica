package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourceFile = userInput.nextLine();

        System.out.println("What is the destination file?");
        String destinationFile = userInput.nextLine();

        try {
            File file = new File(sourceFile);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replaceAll("\\b" + searchWord + "\\b", replacementWord));
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Invalid file path.");
        }

    }

}
