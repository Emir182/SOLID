package com.example.solid.patterns.SOLID.D;

public class NotificationService {

    Notification notification;

    public NotificationService(Notification notification){
        this.notification = notification;
    }

    public void sendMessage(String message){
        notification.send(message);
    }
}
