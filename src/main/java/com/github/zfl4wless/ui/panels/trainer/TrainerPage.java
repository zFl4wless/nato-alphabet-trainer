package com.github.zfl4wless.ui.panels.trainer;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.ui.panels.trainer.components.RandomWord;
import com.github.zfl4wless.ui.panels.trainer.components.SolutionButton;

import javax.swing.*;

public class TrainerPage {
    private static final JPanel panel = Main.getApp().getPanelHandler().createPanel();

    public static void render() {
        panel.add(new RandomWord());
        panel.add(new SolutionButton());

        Main.getApp().getPanelHandler().showPanel(panel);
    }
}
