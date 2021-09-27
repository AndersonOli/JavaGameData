package com.andersonoli.menu;

import com.andersonoli.game.interfaces.IGameAction;

public class MenuAction {
    public MenuItem item;
    public IGameAction action;

    public MenuAction(MenuItem item, IGameAction action) {
        this.item = item;
        this.action = action;
    }

    public void callGameAction() {
        this.action.make();
    }
}
