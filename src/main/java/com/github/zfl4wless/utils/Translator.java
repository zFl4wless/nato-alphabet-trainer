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

    public String translate(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : name.toCharArray()) {
            stringBuilder.append(this.getCodeWordBySymbol(ch)).append("\n");
        }

        return stringBuilder.toString();
    }

    private String getCodeWordBySymbol(char symbol) {
        return this.natoAlphabet.getString(String.valueOf(symbol));
    }
}
