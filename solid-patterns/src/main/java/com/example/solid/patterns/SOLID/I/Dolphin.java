package com.example.solid.patterns.SOLID.I;

public class Dolphin implements SeaAnimal{

    @Override
    public void eat(){
        System.out.println("Dolphin is eating");
    }

    @Override
    public void swim(){
        System.out.println("Dolphin is swimming");
    }
}
