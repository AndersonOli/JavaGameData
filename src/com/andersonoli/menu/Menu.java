package com.andersonoli.menu;

import com.andersonoli.menu.interfaces.IMenu;

public class Menu implements IMenu {
    private final MenuHandle handle;

    public Menu(MenuHandle handle) {
        this.handle = handle;
    }

    @Override
    public void showMenu() {
        MenuAction[] actions = this.handle.actions;

        System.out.println("\nMenu\n");

        for (MenuAction action : actions) {
            action.item.showItem();
        }
    }

    @Override
    public void runHandle() {
        this.handle.getUserInput();
        this.handle.execActionByUserInput();
    }
}
