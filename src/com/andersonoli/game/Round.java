package com.andersonoli.game;

import com.andersonoli.game.interfaces.IRound;

import java.util.Comparator;
import java.util.List;

public class Round implements IRound {
    public Player[] players;
    public Integer numberOfRound;
    final private Integer MAX_PLAYS = 3;

    public Round(Player[] players, Integer numberOfRound) {
        this.players = players;
        this.numberOfRound = numberOfRound;
    }

    @Override
    public void execRound() {
        for (Player player : this.players) {
            for (int i = 0; i < MAX_PLAYS; i++) {
                player.play();
            }

            List<Data> playerData = player.data.subList(numberOfRound - 1, (numberOfRound * MAX_PLAYS));

            int playerPointsInThisRound = 0;

            for (Data playerDatum : playerData) {
                playerPointsInThisRound += playerDatum.getValue();
            }

            int boost = this.boostByRound(playerData);

            if(boost > 1){
                player.setPoints((boost * playerPointsInThisRound));
            } else {
                player.setPoints(playerPointsInThisRound);
            }

            System.out.printf(
                "\n\t[Game] - O Jogador %s faturou %d pontos até agora!\n\n",
                player.name, player.points
            );
        }
    }

    public Integer boostByRound(List<Data> playerData) {
        playerData.sort(Comparator.comparing(Data::getValue));

        int previous = playerData.get(0).getValue();

        int dupCount = 0;

        for (Data data : playerData) {
            if (data.getValue() == previous) {
                ++dupCount;
            } else {
                previous = data.getValue();
            }
        }

        return dupCount;
    }
}
