package com.github.zfl4wless.ui;

import javax.swing.*;
import java.awt.*;

public class PanelHandler {
    private final JFrame mainFrame;
    private JPanel currentPanel;

    public PanelHandler() {
        this.mainFrame = new MainFrame();
    }

    public JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 120, 60, 120));
        panel.setLayout(new GridLayout(0, 1));

        return panel;
    }

    public void showPanel(JPanel panel) {
        if (this.currentPanel != null) {
            this.mainFrame.remove(this.currentPanel);
        }

        this.mainFrame.add(panel, BorderLayout.CENTER);
        this.currentPanel = panel;
    }

    public JFrame getMainFrame() {
        return this.mainFrame;
    }

    public JPanel getCurrentPanel() {
        return this.currentPanel;
    }
}
