package com.andersonoli.menu;

import com.andersonoli.menu.interfaces.IMenuItem;

public class MenuItem implements IMenuItem {
    private Integer key;
    private String title;

    public MenuItem(Integer key, String title){
        setKey(key);
        setTitle(title);
    }

    @Override
    public void showItem() {
        System.out.printf("%d. %s\n", this.key, this.title);
    }

    @Override
    public void setKey(Integer key) {
        this.key = key;
    }

    @Override
    public Integer getKey() {
        return this.key;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
