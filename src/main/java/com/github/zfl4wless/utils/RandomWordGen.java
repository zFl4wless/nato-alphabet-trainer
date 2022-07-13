package com.github.zfl4wless.utils;

import com.github.dhiraj072.randomwordgenerator.RandomWordGenerator;

public class RandomWordGen {

    public static String getRandomString() {
        String word;

        do {
            word = RandomWordGenerator.getRandomWord();
        } while (word.length() > 10);

        return word;
    }
}
