package com.github.zfl4wless.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Objects;
import java.util.Random;

public class RandomWordGen {
    private static JSONArray wordsArray;
    private static final Random random = new Random();

    public RandomWordGen() {
        JSONObject wordsObject = new JSONObject(
                Objects.requireNonNull(FIleUtils.readResource("words.json"))
        );
        wordsArray = wordsObject.getJSONArray("nouns");

    }

    public String getRandomWord() {
        return wordsArray.getString(random.nextInt(wordsArray.length() - 1));
    }
}
