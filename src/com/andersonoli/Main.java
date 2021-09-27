package com.andersonoli;


import com.andersonoli.game.Exit;
import com.andersonoli.game.interfaces.IGameAction;
import com.andersonoli.menu.Menu;
import com.andersonoli.menu.MenuAction;
import com.andersonoli.menu.MenuHandle;
import com.andersonoli.menu.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
