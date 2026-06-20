package com.ldd.design_patterns.StructuralDesignPattern.Facade.Services;

public class PaymentService {
    public boolean pay(int amt,String orderId){
        if(amt > 100){
            System.out.println("Amount Paid for id: "+orderId);
            return true;
        }
        return false;
    }
}
