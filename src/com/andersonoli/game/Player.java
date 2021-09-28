package com.andersonoli.game;

import com.andersonoli.game.interfaces.IPlayer;

import java.util.ArrayList;

public class Player implements IPlayer {
    public String name;
    public ArrayList<Data> data;
    public Integer points = 0;

    public Player(String name){
        this.name = name;
        this.data = new ArrayList<>();
    }

    @Override
    public void play() {
        Data newData = new Data();

        this.data.add(newData);

        int playPoints = newData.getValue();

        System.out.printf(
                "\n\t[Game] - O Jogador %s jogou e seus dados equivalem à %d.\n",
                this.name, playPoints
        );
    }

    public void setPoints(Integer value) {
        this.points += value;
    }
}
