package org.example;

public class Point extends GraphObject{
    private Coords coords;

    public Point(Coords coords) {
        this.coords = coords;
    }

    @Override
    public void draw() {
        System.out.println("Draw point: " + coords.getX() + " - " + coords.getY() + "; Color: " + getColor());
    }
}
