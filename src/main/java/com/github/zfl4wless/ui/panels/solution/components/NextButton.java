package com.github.zfl4wless.ui.panels.solution.components;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.ui.panels.trainer.TrainerPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextButton extends JButton implements ActionListener {
    public NextButton() {
        super("Next");

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TrainerPanel.render();
    }
}
