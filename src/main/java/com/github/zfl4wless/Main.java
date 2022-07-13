package com.github.zfl4wless;

import com.github.zfl4wless.ui.panels.PanelHandler;
import com.github.zfl4wless.ui.panels.trainer.TrainerPanel;
import com.github.zfl4wless.utils.RandomWordGen;
import com.github.zfl4wless.utils.Translator;

public class Main {
    public static Main app;
    private final Translator translator;
    private final PanelHandler panelHandler;
    private final RandomWordGen randomWordGenerator;

    public Main() {
        app = this;

        this.translator = new Translator();
        this.panelHandler = new PanelHandler();
        this.randomWordGenerator = new RandomWordGen();

        TrainerPanel.render();
    }

    public static Main getApp() {
        return app;
    }
    public Translator getTranslator() {
        return this.translator;
    }
    public PanelHandler getPanelHandler() {
        return this.panelHandler;
    }
    public RandomWordGen getRandomWordGenerator() {
        return this.randomWordGenerator;
    }

    public static void main(String[] args) {
        new Main();
    }
}