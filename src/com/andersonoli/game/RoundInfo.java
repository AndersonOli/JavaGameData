package com.andersonoli.game;

import com.andersonoli.game.interfaces.IGameAction;

import java.util.Scanner;

public class RoundInfo implements IGameAction {
    public Integer rounds = 3;

    public void getByUserNumberOfRounds(){
        System.out.print("\nPor favor, informe a quantidade de jogadas[3-5]: ");

        try {
            Scanner scanner = new Scanner(System.in);

            int roundsUser = Integer.parseInt(scanner.next());

            if(roundsUser >= 3 && roundsUser <= 5){
                this.rounds = roundsUser;
            } else {
                System.out.println("\nÉ necessário no mínimo 3 e no máximo 5 rodasdas!");
                this.getByUserNumberOfRounds();
            }
        } catch (Exception error){
            System.out.println("\n\nPor favor, informe um número válido de rodadas!\n\n");
        }
    }

    @Override
    public void make() {
        this.getByUserNumberOfRounds();
    }
}
