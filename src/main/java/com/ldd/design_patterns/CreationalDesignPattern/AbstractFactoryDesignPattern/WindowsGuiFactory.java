package com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Button;
import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.Checkbox;
import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.WindowsButton;
import com.ldd.design_patterns.CreationalDesignPattern.AbstractFactoryDesignPattern.GUIComponents.WindowsCheckbox;

public class WindowsGuiFactory implements GUIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
