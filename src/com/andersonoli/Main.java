package com.andersonoli;


import com.andersonoli.game.Data;
import com.andersonoli.game.Player;
import com.andersonoli.game.Round;
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
            // Action's list menu
            MenuAction[] actions = {
                new MenuAction(new MenuItem(1, "Exit"), new Exit()),
                new MenuAction(new MenuItem(5, "Exit"), new Exit()),
            };

            Player[] players = {
                new Player("Anderson"),
                new Player("Zé"),
            };

            Round round = new Round(players, 1);

            round.execRound();

            // Menu of the game
            Menu gameDataMenu = new Menu(MenuHandle.getInstance(actions));

            // start game
            gameDataMenu.showMenu();
            gameDataMenu.runHandle();
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
