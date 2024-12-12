package ru.frigesty;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {

    private final List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
        System.out.println("list.addGame(" + game + ")");
    }

    public void printGames() {
        System.out.println("list.printGameList");
        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            System.out.println("Game name: " + game.getGameName() +
                               ", Developer: " + game.getDeveloper() +
                               ", Price: $" + game.getPrice() +
                               ", Has DLC: " + game.isHaveDLS());
        }
    }

    public void deleteGame(Game game) {
        System.out.println("list.remove(" + game + ")");
        games.remove(game);
    }

    public void isGameInList(Game value) {
        System.out.println("list.isGameInList(" + value + ")");
        System.out.println("Game " + value + " is in the list: " + games.contains(value));
    }

    public void printGameIndex(Game value){
        System.out.println("list.printGameIndex(" + value + ")");
        int gameIndex = games.indexOf(value);
        System.out.println("Индекс игры " + value + ": " + gameIndex);
    }

    public void printGameByIndex(int index){
        System.out.println("list.printGameByIndex(" + index + ")");
        System.out.println("Игра по индексу " + index + ": " + games.get(index).getGameName());
    }

    public void changeValueInIndex(int index, Game gameName){
        System.out.println("list.changeValueInIndex(" + index + "," + gameName + ")");
        games.set(index, gameName);
        System.out.println("Изменили значение в индексе " + index + " на " + gameName.getGameName());
    }

    public void addValueInIndex(int index, Game gameName){
        System.out.println("list.set(" + index + "," + gameName + ")");
        games.set(index, gameName);
        System.out.println("Добавили игру " + gameName.getGameName() + " в индекс " + index + ".");
    }
}