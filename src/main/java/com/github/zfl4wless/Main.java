package com.github.zfl4wless;

import com.github.zfl4wless.utils.Translator;

public class Main {
    private final Translator translator;

    public Main() {
        this.translator = new Translator();
    }

    public Translator getTranslator() {
        return this.translator;
    }

    public static void main(String[] args) {
        new Main();
    }
}