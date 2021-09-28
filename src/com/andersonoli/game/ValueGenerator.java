package com.andersonoli.game;

import com.andersonoli.game.interfaces.IValueGenerator;

import java.util.Random;

public class ValueGenerator implements IValueGenerator {
    @Override
    public Integer generate(Integer maxRange) {
        Random random = new Random();

        return random.nextInt(maxRange);
    }
}
