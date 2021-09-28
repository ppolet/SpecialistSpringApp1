package org.example;

public class Line extends GraphObject{
    private Coords coords1;
    private Coords coords2;

    public Line(Coords coords1, Coords coords2, String color) {
        this.coords1 = coords1;
        this.coords2 = coords2;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw Line: " + coords1.getX() + " - " + coords1.getY() + " ----- " + coords2.getX() + " - " + coords2.getY() + "; Color: " + getColor());
    }
}
