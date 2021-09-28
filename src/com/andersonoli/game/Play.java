package com.andersonoli.game;

import com.andersonoli.game.interfaces.IGameAction;

public class Play implements IGameAction {
    public Player[] players;
    public RoundInfo roundHandler;

    public Play(Player[] players, RoundInfo roundHandler){
        this.players = players;
        this.roundHandler = roundHandler;
    }

    @Override
    public void make() {
        for (int i = 1; i <= roundHandler.rounds; i++) {
            Round round = new Round(players, i);

            round.execRound();
        }

        sayWinner();
        resetPontuation();
    }

    public void sayWinner(){
        int greaterPontuation = this.players[0].points;
        int index = 0;

        for(int i = 0; i < this.players.length; i++){
            if (this.players[i].points > greaterPontuation){
                greaterPontuation = this.players[i].points;
                index = i;
            }
        }

        System.out.printf("\n\n\n[O Ganhador é o Jogador %s, com %d pontos!]\n\n\n", this.players[index].name, greaterPontuation);
    }

    public void resetPontuation() {
        for (Player player : this.players) {
            player.setPoints(0);
        }
    }
}
