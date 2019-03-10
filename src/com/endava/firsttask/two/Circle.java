package com.endava.firsttask.two;

import com.endava.firsttask.eight.GraphicObject;

public class Circle  extends GraphicObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*(radius*radius);
    }


    public double calcPerimeter() {
        return 2*Math.PI*radius;
    }
}
