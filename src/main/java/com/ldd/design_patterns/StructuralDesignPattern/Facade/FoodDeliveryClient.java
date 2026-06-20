package com.ldd.design_patterns.StructuralDesignPattern.Facade;

import org.springframework.core.annotation.Order;

public class FoodDeliveryClient {
    public static void main(String[] args) {
        OrderFacade orderFacade=new OrderFacade();
        orderFacade.order(21,"9876543211");
    }
}
