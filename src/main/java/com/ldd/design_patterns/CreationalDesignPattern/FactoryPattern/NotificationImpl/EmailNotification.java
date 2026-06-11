package com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.NotificationImpl;

import com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
