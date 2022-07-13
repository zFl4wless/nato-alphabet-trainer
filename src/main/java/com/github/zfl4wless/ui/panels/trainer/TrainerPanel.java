package com.github.zfl4wless.ui.panels.trainer;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.managers.RandomWordManager;
import com.github.zfl4wless.ui.panels.trainer.components.RandomWord;
import com.github.zfl4wless.ui.panels.trainer.components.SolutionButton;

import javax.swing.*;

public class TrainerPanel {
    public static void render() {
        RandomWordManager.randomWord = Main.getApp().getRandomWordGenerator().getRandomWord();

        JPanel panel = Main.getApp().getPanelHandler().createPanel();
        panel.add(new RandomWord());
        panel.add(new SolutionButton());

        Main.getApp().getPanelHandler().showPanel(panel);
    }
}
