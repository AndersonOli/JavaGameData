package com.andersonoli.game;

import com.andersonoli.game.interfaces.IGameAction;

public class About implements IGameAction {
    @Override
    public void make() {
        System.out.println("\n\nSobre o jogo: \n");

        System.out.println("""
                Regras:\s
                1. Cada jogador irá lançar três dados por rodada
                2. Se na rodada tiverem dois dados iguais, a pontuação do jogador é multiplicada por dois.
                3. Se na rodada tiverem três dados iguais, a pontuação do jogador é multiplicada por três.
                
                :)
                """
        );
    }
}
