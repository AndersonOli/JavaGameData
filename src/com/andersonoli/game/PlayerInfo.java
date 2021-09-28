package com.andersonoli.game;

import com.andersonoli.game.interfaces.IGameAction;

import java.util.Scanner;

public class PlayerInfo implements IGameAction {
    final private int PLAYERS_QUANTITY = 2;
    public Player[] players = new Player[PLAYERS_QUANTITY];

    public void getByUserThePlayers(){
        for (int i = 0; i < PLAYERS_QUANTITY; i++) {
            System.out.printf("\nPor favor, o nome do %d° jogador: ", i + 1);

            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();

            players[i] = new Player(name);
        }
    }

    @Override
    public void make() {
        this.getByUserThePlayers();
    }
}
