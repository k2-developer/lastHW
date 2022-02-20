package ru.netology.domain;

public class Author {
    private int id;
    private String nickname;

    public Author(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
