package com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.*;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
