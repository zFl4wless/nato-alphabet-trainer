package com.github.zfl4wless.ui;

import javax.swing.*;
import java.awt.*;

public class PanelHandler {
    private final JFrame mainFrame;
    private JPanel currentPanel;

    public PanelHandler() {
        this.mainFrame = new MainFrame();
    }

    /**
     * Creates a new panel.
     *
     * @return The created panel.
     */
    public JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 120, 60, 120));
        panel.setLayout(new GridLayout(0, 1));

        return panel;
    }

    /**
     * Renders a new panel to the main frame.
     *
     * @param panel The panel.
     */
    public void showPanel(JPanel panel) {
        if (this.currentPanel != null) {
            this.mainFrame.remove(this.currentPanel);
        }

        this.mainFrame.add(panel, BorderLayout.CENTER);
        this.currentPanel = panel;
    }

    /**
     * Gets the main frame.
     *
     * @return The main frame.
     */
    public JFrame getMainFrame() {
        return this.mainFrame;
    }

    /**
     * Gets the current panel.
     *
     * @return The current panel.
     */
    public JPanel getCurrentPanel() {
        return this.currentPanel;
    }
}
