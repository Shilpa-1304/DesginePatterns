package com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorators;

import com.ldd.design_patterns.StructuralDesignPattern.Decorator.Coffee;
import com.ldd.design_patterns.StructuralDesignPattern.Decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" + Sugar ";
    }

    @Override
    public int getprice() {
        return coffee.getprice()+25;
    }
}
