package com.github.zfl4wless.ui.panels.trainer.components;

import com.github.zfl4wless.Main;

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

    }
}
