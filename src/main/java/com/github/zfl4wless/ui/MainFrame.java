package com.github.zfl4wless.ui;

import javax.swing.*;

/**
 * This class represents the main frame.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("nato alphabet trainer");
        pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
}
