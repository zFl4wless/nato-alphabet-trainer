package com.github.zfl4wless.ui.panels.trainer.components;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.managers.RandomWordManager;
import com.github.zfl4wless.ui.panels.solution.SolutionPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolutionButton extends JButton implements ActionListener {
    public SolutionButton() {
        super("Show solution");

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SolutionPanel.render(Main.getApp().getTranslator().translate(RandomWordManager.randomWord));
    }
}
