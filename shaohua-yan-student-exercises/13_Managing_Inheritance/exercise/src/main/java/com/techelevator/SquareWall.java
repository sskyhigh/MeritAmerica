package com.techelevator;

public class SquareWall extends RectangleWall {
    private int side;

    public SquareWall(String name, String color, int sideLength) {
        super(name, color); this.side = sideLength;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return getName() + " (" + side + "x" + side + ")" + " square";
    }
}
