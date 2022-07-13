package com.github.zfl4wless.ui.panels.trainer.components;

import com.github.zfl4wless.managers.RandomWordManager;

import javax.swing.*;

public class RandomWord extends JLabel {
    public RandomWord() {
        super(RandomWordManager.randomWord);
    }
}
