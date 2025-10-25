package com.example.solid.patterns.SOLID.O;
import java.lang.Math;


public class Circle implements Shape{

    @Override
    public double area(double r, double b){
        return Math.PI * r * r;
    }
}
