package ru.netology.domain;

import java.awt.*;

public class Label {
    private int id;
    private String name;
    private String theme;
    private String type;


    public Label(int id, String name, String theme, String type) {
        this.id = id;
        this.name = name;
        this.theme = theme;
        this.type = type;
    }

    public Label() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
