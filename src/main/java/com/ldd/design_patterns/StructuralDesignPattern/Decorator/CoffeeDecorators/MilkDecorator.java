package com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorators;

import com.ldd.design_patterns.StructuralDesignPattern.Decorator.Coffee;
import com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" + Milk ";
    }

    @Override
    public int getprice() {
        return coffee.getprice()+50;
    }
}
