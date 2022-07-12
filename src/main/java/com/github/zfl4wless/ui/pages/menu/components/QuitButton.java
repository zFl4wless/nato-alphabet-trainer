package com.github.zfl4wless.ui.pages.menu.components;

import com.github.zfl4wless.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitButton extends JButton implements ActionListener {
    public QuitButton() {
        super("Quit");

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.getApp().getPageHandler().getMainFrame().dispose();
    }
}
