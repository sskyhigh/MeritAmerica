package com.techelevator;

public class Airplane {
    private final String planeNumber;
    private final int totalFirstClassSeats;
    private final int totalCoachSeats;
    private int bookedFirstClassSeats;
    private int bookedCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber; this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        /*
        Create a method called reserveSeats that returns a boolean and accepts two parameters: a
        boolean called forFirstClass and an int called totalNumberOfSeats.

        If forFirstClass is true, add totalNumberOfSeats to the value for bookedFirstClassSeats.
        If forFirstClass is false, add totalNumberOfSeats to the value for bookedCoachSeats.
        It returns true if there were enough seats to make the reservation, otherwise it returns
        false
        and the number of booked seats doesn't change.

         */
        if (forFirstClass) {
            // evaluate condition
            if (getTotalFirstClassSeats() >= totalNumberOfSeats) {
                // add totalseats to booked seats
                bookedFirstClassSeats += totalNumberOfSeats; return true;
            }
        } else {
            if (getAvailableCoachSeats() >= totalNumberOfSeats) {
                // if false, all to booked seats
                bookedCoachSeats += totalNumberOfSeats; return true;
            }
        } return false;
    }
}
