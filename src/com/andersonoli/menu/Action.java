package com.andersonoli.menu;

import com.andersonoli.game.interfaces.IGameAction;

public abstract class Action implements IAction {
    public IGameAction action;

    @Override
    public void callGameAction() {
        this.action.make();
    }
}
