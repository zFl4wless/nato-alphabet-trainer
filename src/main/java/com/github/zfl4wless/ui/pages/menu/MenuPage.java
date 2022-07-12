package com.github.zfl4wless.ui.pages.menu;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.ui.pages.menu.components.QuitButton;
import com.github.zfl4wless.ui.pages.menu.components.StartButton;

import javax.swing.*;

public class MenuPage {
    private static final JPanel page = Main.getApp().getPageHandler().createPage();

    public static JPanel render() {
        page.add(new StartButton());
        page.add(Box.createVerticalStrut(5));
        page.add(new QuitButton());

        return page;
    }
}
