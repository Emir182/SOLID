package com.example.solid.patterns.SOLID.S;

public class PaymentProcessor {
    Validator val = new Validator();
    Email email = new Email();
    PaymentGateway gate = new PaymentGateway();
    LogPayment log = new LogPayment();
    public void processPayment(double amount){
        val.Validate(amount);
        gate.connect();
        log.Log(amount, "Emir");
        email.sendEmail("emirchik@gmail.com");
    }
}
