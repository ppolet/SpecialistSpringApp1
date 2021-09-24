package org.example;

public class Circle extends GraphObject{
    private Coords coords;
    private int radius;

    public Circle(Coords coords, int radius) {
        this.coords = coords;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle: " + coords.getX() + " - " + coords.getY() + "; Radius: " + radius + "; Color: " + getColor());
    }
}
