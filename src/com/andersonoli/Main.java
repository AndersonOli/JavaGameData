package com.andersonoli;


import com.andersonoli.game.*;
import com.andersonoli.game.menuActions.Exit;
import com.andersonoli.menu.Menu;
import com.andersonoli.menu.MenuAction;
import com.andersonoli.menu.MenuHandle;
import com.andersonoli.menu.MenuItem;

public class Main {

    public static void main(String[] args) {
        // Setup and start of the GameData
        try {
            // setup
            PlayerInfo playersInfo = new PlayerInfo();
            RoundInfo roundInfo = new RoundInfo();

            while(true){
                // Action's list menu
                MenuAction[] actions = {
                        new MenuAction(new MenuItem(1, "Informar o nome dos jogadores"), playersInfo), // @TO-DO
                        new MenuAction(new MenuItem(2, "Informar o número de rodadas"), roundInfo),
                        new MenuAction(new MenuItem(3, "Jogar"), new Play(playersInfo.players, roundInfo)),
                        new MenuAction(new MenuItem(4, "Sobre o jogo"), new About()),
                        new MenuAction(new MenuItem(5, "Exit"), new Exit()),
                };

                // Menu of the game
                Menu gameDataMenu = new Menu(MenuHandle.getInstance(actions));

                // start game
                gameDataMenu.showMenu();
                gameDataMenu.runHandle();
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
