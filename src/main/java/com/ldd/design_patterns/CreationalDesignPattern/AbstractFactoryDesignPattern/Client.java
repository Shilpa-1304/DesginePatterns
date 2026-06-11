package com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Button;
import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.WindowsButton;

public class Client {
    public static void main(String[] args) {
        GUIFactory factory=new WindowsGuiFactory();
        factory.createButton().render();
        factory.createCheckbox().check();
    }
}
