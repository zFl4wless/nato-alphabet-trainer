package com.github.zfl4wless;

import com.github.zfl4wless.ui.PanelHandler;
import com.github.zfl4wless.utils.Translator;

public class Main {
    public static Main app;
    private final Translator translator;
    private final PanelHandler panelHandler;

    public Main() {
        app = this;

        this.translator = new Translator();
        this.panelHandler = new PanelHandler();
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

    public static void main(String[] args) {
        new Main();
    }
}