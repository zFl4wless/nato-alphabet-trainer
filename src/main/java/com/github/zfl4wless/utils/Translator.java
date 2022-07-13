package com.github.zfl4wless.utils;

import org.json.JSONObject;

import java.util.Objects;

public class Translator {
    private final JSONObject natoAlphabet;

    public Translator() {
        this.natoAlphabet = new JSONObject(
                Objects.requireNonNull(FIleUtils.readResource("nato-alphabet.json"))
        );
    }

    /**
     * Translates every letter of a string into the nato alphabet code name.
     *
     * @param name The name to translate.
     * @return The translated name.
     */
    public String translate(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : name.toUpperCase().toCharArray()) {
            stringBuilder.append(this.getCodeWordBySymbol(ch)).append("\n");
        }

        return stringBuilder.toString();
    }

    /**
     * Gets the nato alphabet code name for a specific letter.
     *
     * @param symbol The symbol.
     * @return The code name.
     */
    private String getCodeWordBySymbol(char symbol) {
        return this.natoAlphabet.getString(String.valueOf(symbol));
    }
}
