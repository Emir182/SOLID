package com.example.solid.patterns.SOLID.O;

public class AreaCalculator {
    Shape shape;
    public AreaCalculator(Shape shape){
        this.shape = shape;
    }

    public double calculate(double r, double b){
        return shape.area(r, b);
    }
}
