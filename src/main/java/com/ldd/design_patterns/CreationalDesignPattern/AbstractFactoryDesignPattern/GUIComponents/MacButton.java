package com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents;

import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Button will render on MAC");
    }
}
