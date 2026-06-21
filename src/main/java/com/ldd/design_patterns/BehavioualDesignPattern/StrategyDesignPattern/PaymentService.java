package com.ldd.design_patterns.BehavioualDesignPattern.StrategyDesignPattern;

public class PaymentService {
    PaymentStrategy paymentStrategy;
    PaymentService(PaymentStrategy strategy){
        this.paymentStrategy=strategy;
    }
    public void makePayment(int amt){
        paymentStrategy.pay(amt);
    }
}
