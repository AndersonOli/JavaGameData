package com.andersonoli.menu;

import com.andersonoli.menu.interfaces.IMenuHandle;

import java.util.Objects;
import java.util.Scanner;

public class MenuHandle implements IMenuHandle {
    private Integer option;
    public MenuAction[] actions;
    private static MenuHandle instance;

    public MenuHandle(MenuAction[] actions){
        this.actions = actions;
    }

    public static MenuHandle getInstance(MenuAction[] actions) {
        if (instance == null) {
            instance = new MenuHandle(actions);
        }

        return instance;
    }

    @Override
    public void getUserInput() {
        try {
            System.out.print("\n:: ");
            Scanner input = new Scanner(System.in);
            this.option = Integer.parseInt(input.next());
        } catch (Exception error){
            System.out.println("Informe um número válido!");
            this.getUserInput();
        }
    }

    @Override
    public void execActionByUserInput() {
        try {
            for (MenuAction action : this.actions) {
                if (Objects.equals(action.item.getKey(), this.option)) {
                    action.callGameAction();
                }
            }
        } catch (Exception error){
            System.out.println("Não foi possível identificar sua ação!");
        }
    }
}
