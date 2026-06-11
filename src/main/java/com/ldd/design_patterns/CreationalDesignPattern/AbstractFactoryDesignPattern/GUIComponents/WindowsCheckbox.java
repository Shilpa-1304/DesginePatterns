package com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents;

import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checkbox will render on Windows");
    }
}
