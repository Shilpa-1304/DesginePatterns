package com.ldd.design_patterns.BehavioualDesignPattern.StrategyDesignPattern;

import com.ldd.design_patterns.BehavioualDesignPattern.StrategyDesignPattern.ConcretePaymentStrategies.UPIPayment;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy=new UPIPayment();
        PaymentService service=new PaymentService(paymentStrategy);
        service.makePayment(11111);
    }
}
