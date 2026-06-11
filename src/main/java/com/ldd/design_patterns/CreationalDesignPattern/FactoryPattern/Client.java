package com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client started");
        NotificationFactory.getNotification("Email").send();
    }
}
