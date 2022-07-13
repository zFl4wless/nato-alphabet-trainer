package com.github.zfl4wless.ui.panels.solution;

import com.github.zfl4wless.Main;
import com.github.zfl4wless.ui.panels.solution.components.NextButton;
import com.github.zfl4wless.ui.panels.solution.components.Solution;

import javax.swing.*;

public class SolutionPanel {
    public static void render(String solution) {
        JPanel panel = Main.getApp().getPanelHandler().createPanel();
        panel.add(new Solution(solution));
        panel.add(new NextButton());

        Main.getApp().getPanelHandler().showPanel(panel);
    }
}
