package com.ldd.design_patterns.BehavioualDesignPattern.StrategyDesignPattern.ConcretePaymentStrategies;

import com.ldd.design_patterns.BehavioualDesignPattern.StrategyDesignPattern.PaymentStrategy;

public class DebitCard implements PaymentStrategy {
    @Override
    public void pay(int amt) {
        System.out.println("Amt: "+amt + " paid through Debit Card.");
    }
}
