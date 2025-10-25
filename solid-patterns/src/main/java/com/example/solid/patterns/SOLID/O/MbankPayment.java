package com.example.solid.patterns.SOLID.O;

public class MbankPayment implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid" + amount + " using Mbank");
    }
}
