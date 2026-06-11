package com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Button;
import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Checkbox;

public interface GUIFactory {
    Checkbox createCheckbox();
    Button createButton();
}
