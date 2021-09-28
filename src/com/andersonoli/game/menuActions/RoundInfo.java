package com.andersonoli.game.menuActions;

import com.andersonoli.game.interfaces.IGameAction;

import java.util.Scanner;

public class RoundInfo implements IGameAction {
    private Integer rounds = 3;

    public void registerNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);

        try {
            int input = Integer.parseInt(scanner.next());

            if(input >= 3){
                this.rounds = input;
            } else {
                System.out.printf("\nO número mínimo de rodadas é %d.\n", this.rounds);
            }
        } catch (Exception error){
            System.out.println("\nDigite um número válido!\n");
            this.registerNumberOfRounds();
        }
    }

    public Integer getNumberOfRounds(){
        return this.rounds;
    }

    @Override
    public void make() {
        this.registerNumberOfRounds();
    }
}
