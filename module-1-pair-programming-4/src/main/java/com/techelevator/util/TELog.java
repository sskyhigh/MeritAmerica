package com.techelevator.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TELog {
    public static void log(String message) throws Exception {
        // writes to output.
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("logs/search.log", true));
            writer.append(message);
            writer.newLine();
            writer.close();
        }
        catch(IOException e){
            // gets error if there is any
            throw new Exception(e.getMessage());
        }
    }
}
