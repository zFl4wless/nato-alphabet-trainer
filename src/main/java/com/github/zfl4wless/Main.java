package com.github.zfl4wless;

import com.github.zfl4wless.ui.PageHandler;
import com.github.zfl4wless.ui.pages.MenuPage;
import com.github.zfl4wless.utils.Translator;

public class Main {
    public static Main app;
    private final Translator translator;
    private final PageHandler pageHandler;

    public Main() {
        app = this;

        this.translator = new Translator();
        this.pageHandler = new PageHandler();

        this.pageHandler.showPage(MenuPage.view());
    }

    public static Main getApp() {
        return app;
    }
    public Translator getTranslator() {
        return this.translator;
    }
    public PageHandler getPageHandler() {
        return this.pageHandler;
    }

    public static void main(String[] args) {
        new Main();
    }
}