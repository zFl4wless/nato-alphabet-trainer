package com.github.zfl4wless.ui.pages.menu.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton implements ActionListener {
    public StartButton() {
        super("Start");

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
