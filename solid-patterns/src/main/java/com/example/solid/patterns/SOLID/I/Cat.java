package com.example.solid.patterns.SOLID.I;

public class Cat implements LandAnimal{

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void run(){
        System.out.println("Cat is running");
    }
}
