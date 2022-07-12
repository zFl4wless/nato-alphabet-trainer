package com.github.zfl4wless.ui.pages.listeners;

import com.github.zfl4wless.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.getApp().getPageHandler().getMainFrame().dispose();
    }
}
