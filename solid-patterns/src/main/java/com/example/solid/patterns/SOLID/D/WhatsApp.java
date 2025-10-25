package com.example.solid.patterns.SOLID.D;

public class WhatsApp implements Notification{

    @Override
    public void send(String message){
        System.out.println(message);
    }
}
