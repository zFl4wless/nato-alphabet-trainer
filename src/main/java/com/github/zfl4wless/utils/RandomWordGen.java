package com.github.zfl4wless.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Objects;
import java.util.Random;

public class RandomWordGen {

    private static JSONObject wordsObject;
    private static JSONArray wordsArray;
    private static Random random = new Random();

    public RandomWordGen() {
        wordsObject = new JSONObject(
                Objects.requireNonNull(FIleUtils.readResource("words.json"))
        );
        wordsArray = wordsObject.getJSONArray("nouns");

    }

    public String getRandomString() {
        return wordsArray.getString(random.nextInt(wordsArray.length() - 1));
    }
}
