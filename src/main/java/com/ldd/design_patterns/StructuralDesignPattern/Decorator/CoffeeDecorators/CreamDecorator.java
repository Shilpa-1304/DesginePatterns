package com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorators;

import com.ldd.design_patterns.StructuralDesignPattern.Decorator.Coffee;
import com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorator;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" + cream ";
    }

    @Override
    public int getprice() {
        return coffee.getprice()+75;
    }
}

