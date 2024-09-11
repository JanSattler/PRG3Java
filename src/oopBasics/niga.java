package oopBasics;

import java.awt.*;

public class niga {
    public static void main(String[] args) {
        double x = 1.12;
        double y = 5.87;
        Coordinates coordinates = new Coordinates(x,y);
    }
}



class Coordinates {
    double x,y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
}



class Rectangle {
    double height, width;

    final double DEFAULT_HEIGHT = 4;
    final double DEFAULT_WIDTH = 2;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Dimension d) {
        this.height = d.getHeight();
        this.width = d.getWidth();
    }


    public Rectangle() {
        this.height = DEFAULT_HEIGHT;
        this.width = DEFAULT_WIDTH;
    }
}
