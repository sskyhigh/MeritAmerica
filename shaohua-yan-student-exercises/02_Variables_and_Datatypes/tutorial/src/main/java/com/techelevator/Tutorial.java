package com.techelevator;

public class Tutorial {
    public static void main(String[] args) {
        /******************************************************************************/
        // Step 1: Declare and initialize variables
        /******************************************************************************/
        double costOfDinner = 120.00;
        int tipPercent = 18;
        int numberOfGuests = 4;

        // Greet the user
        System.out.println("********************************************");
        System.out.println("*** Welcome to the Restaurant Calculator ***");
        System.out.println("********************************************");
        System.out.println("Cost of dinner: $" + costOfDinner);

        /******************************************************************************/
        // Step 2: Calculate the sales tax and tip
        /******************************************************************************/

        final double sales_tax = 7.5;
        double taxAmount = 7.5 / 100 * costOfDinner;


        double tipAmount = tipPercent / 100.0 * costOfDinner;
        //System.out.println("Cost of dinner: " + costOfDinner);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Tip: $" + tipAmount);

        /******************************************************************************/
        // Step 3: Calculate the amount per person
        /******************************************************************************/

        double amountPerPerson = (costOfDinner + taxAmount + tipAmount) / numberOfGuests;
        System.out.println("Amount per person: " + amountPerPerson);




        /******************************************************************************/
        // Step 4: Given the total number of dessert pieces, determine the number each
        //      guest gets, and the number left over after each guest eats their pieces.
        /******************************************************************************/


        int numberOfCookies = 9;
        int numberCookiesPerGuest = numberOfCookies / numberOfGuests;
        int leftoverPieces = numberOfCookies % numberOfGuests;
        System.out.println("Each guest can eat " + numberCookiesPerGuest + " cookies, with " + leftoverPieces + " left over.");




        System.out.println("********************************************");
        System.out.println("** Thanks for using Restaurant Calculator **");
        System.out.println("********************************************");

    }
}
