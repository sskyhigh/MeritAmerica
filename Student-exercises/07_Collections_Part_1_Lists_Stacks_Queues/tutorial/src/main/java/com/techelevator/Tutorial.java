package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Tutorial {

    public static void main(String[] args) {

        // Step One: Declare a List
        // String [] nameList;
        List<String> nameList = new ArrayList<String>();


        // Step Two: Add values to a List
        nameList.add("Ada");
        nameList.add("Grace");
        nameList.add("Margaret");
        nameList.add("Adele");
        System.out.println(nameList);
        // Step Three: Looping through a List in a for loop
        for(int i = 0; i< nameList.size(); ++i){
            System.out.println("The name at index " + i + " is " + nameList.get(i));
        }

        // Step Four: Remove an item
        nameList.remove("Ada");
        //nameList.remove(0);

        // Step Five: Looping through List in a for-each loop
        for(String name: nameList){
            System.out.println("Name: " + name);
        }
    }

}
