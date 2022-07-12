package com.github.zfl4wless.ui;

import javax.swing.*;
import java.awt.*;

public class PageHandler {
    private final JFrame mainFrame;
    private JPanel currentPage;

    public PageHandler() {
        this.mainFrame = new MainFrame();
    }

    public JPanel createPage() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 120, 60, 120));
        panel.setLayout(new GridLayout(0, 1));

        return panel;
    }

    public void showPage(JPanel page) {
        if (this.currentPage != null) {
            this.mainFrame.remove(this.currentPage);
        }

        this.mainFrame.add(page, BorderLayout.CENTER);
        this.currentPage = page;
    }

    public JFrame getMainFrame() {
        return this.mainFrame;
    }

    public JPanel getCurrentPage() {
        return this.currentPage;
    }
}
