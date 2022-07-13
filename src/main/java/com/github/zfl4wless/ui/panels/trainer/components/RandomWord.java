package com.github.zfl4wless.ui.panels.trainer.components;

import com.github.zfl4wless.Main;

import javax.swing.*;

public class RandomWord extends JLabel {
    public RandomWord() {
        super(Main.getApp().getRandomWordGenerator().getRandomWord());
    }
}
