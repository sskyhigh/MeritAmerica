package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private boolean openDoor = false;
    private int numberOfFloors;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return openDoor;
    }

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
    }

    public void openDoor() {
        openDoor = true;
    }

    public void closeDoor() {
        openDoor = false;
    }

    public void goUp(int desiredFloor) {
        if (!openDoor && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
            currentFloor = desiredFloor;
        }

    }

    public void goDown(int desiredFloor) {
        if (!openDoor && desiredFloor <= currentFloor && currentFloor > 1) {
            currentFloor = desiredFloor;
        }
    }
}
