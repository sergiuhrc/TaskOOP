package com.endava.firsttask.one;

import com.endava.firsttask.eight.GraphicObject;

public class Square  extends GraphicObject {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calcArea(){
        return sideLength*2;
    }


    public double calcPerimeter(){
        return sideLength*4;
    }
}
