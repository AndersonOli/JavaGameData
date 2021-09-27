package com.andersonoli.game;

import com.andersonoli.game.interfaces.IGameAction;

public class Exit implements IGameAction {
    @Override
    public void make() {
        System.out.println("\nJogo finalizado!");

        System.exit(0);
    }
}
