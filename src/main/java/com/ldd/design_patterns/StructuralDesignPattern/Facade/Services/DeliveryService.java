package com.ldd.design_patterns.StructuralDesignPattern.Facade.Services;

public class DeliveryService {
    public void assignRider(String orderId){
        System.out.println("Rider assigned for order: "+orderId);
    }
}
