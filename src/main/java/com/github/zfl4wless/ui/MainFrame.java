package com.github.zfl4wless.ui;

import javax.swing.*;

/**
 * This class represents the main frame.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        super("NATO alphabet trainer");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 500);
        setResizable(false);
    }
}
