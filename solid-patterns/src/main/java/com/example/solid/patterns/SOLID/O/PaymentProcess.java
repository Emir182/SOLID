package com.example.solid.patterns.SOLID.O;

public class PaymentProcess {
    private Payment payment;

    public PaymentProcess(Payment payment){
        this.payment = payment;
    }

    public void process(double amount){
        payment.pay(amount);

    }
}
