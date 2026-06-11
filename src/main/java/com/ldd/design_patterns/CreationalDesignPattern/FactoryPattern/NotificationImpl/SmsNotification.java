package com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.NotificationImpl;

import com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
