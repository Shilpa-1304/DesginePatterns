package com.ldd.design_patterns.StructuralDesignPattern.Decorator;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee ";
    }

    @Override
    public int getprice() {
        return 100;
    }
}
