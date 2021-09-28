package com.andersonoli.game;

import com.andersonoli.game.interfaces.IData;

public class Data implements IData {
    private Integer value;
    final private Integer MAX_RANGE = 6;
    final private Integer MIN_RANGE = 1;

    public Data(){
        this.generateValue();
    }

    @Override
    public Integer generateValue() {
        if(this.value == null){
            ValueGenerator generator = new ValueGenerator();
            this.value = generator.generate(MAX_RANGE) + MIN_RANGE;
        }

        return this.getValue();
    }

    @Override
    public Integer getValue() {
        return this.value;
    }
}
