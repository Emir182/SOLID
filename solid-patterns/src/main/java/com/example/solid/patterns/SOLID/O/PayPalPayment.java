package com.example.solid.patterns.SOLID.O;

public class PayPalPayment implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount +  " using PayPal!");
    }
}
