package com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern;

import com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.NotificationImpl.EmailNotification;
import com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.NotificationImpl.SmsNotification;
import com.ldd.design_patterns.CreationalDesignPattern.FactoryPattern.NotificationImpl.WhatsappNotification;

public class NotificationFactory {
    public static Notification getNotification(String mode){
        System.out.println("Mode fetched from factory on the basis of mode");
        if(mode.equalsIgnoreCase("Email"))
            return new EmailNotification();
        else if(mode.equalsIgnoreCase("Sms"))
            return new SmsNotification();
        else
            return new WhatsappNotification();
    }
}
