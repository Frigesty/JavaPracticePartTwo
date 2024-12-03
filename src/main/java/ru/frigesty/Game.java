package ru.frigesty;

public class Game {
    private String gameName;
    private String developer;
    private boolean haveDLS;
    private int price;

    public Game(String gameName, String developer, boolean haveDLS, int price) {
        this.gameName = gameName;
        this.developer = developer;
        this.haveDLS = haveDLS;
        this.price = price;
    }

    public String getGameName(){
        return this.gameName;
    }

    public String getDeveloper(){
        return this.developer;
    }

    public boolean isHaveDLS(){
        return this.haveDLS;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return gameName;
    }
}