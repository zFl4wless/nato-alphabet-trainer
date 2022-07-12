package com.github.zfl4wless.ui.pages;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.ui.pages.listeners.QuitButtonActionListener;
import com.github.zfl4wless.ui.pages.listeners.StartButtonActionListener;

import javax.swing.*;

public class MenuPage {
    private static final JPanel page = Main.getApp().getPageHandler().createPage();

    public static JPanel render() {
        JButton startButton = new JButton("Start");
        startButton.addActionListener(new StartButtonActionListener());
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new QuitButtonActionListener());

        page.add(startButton);
        page.add(Box.createVerticalStrut(5));
        page.add(quitButton);

        return page;
    }
}
