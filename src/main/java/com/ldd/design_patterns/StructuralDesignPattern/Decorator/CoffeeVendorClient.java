package com.ldd.design_patterns.StructuralDesignPattern.Decorator;

import com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorators.CreamDecorator;
import com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorators.MilkDecorator;
import com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorators.SugarDecorator;

public class CoffeeVendorClient {
    public static void main(String[] args) {
        Coffee coffee=new BasicCoffee();
        coffee=new MilkDecorator(coffee);
        coffee=new SugarDecorator(coffee);
        coffee=new CreamDecorator(coffee);
        System.out.println(coffee.getDescription());
    }
}
