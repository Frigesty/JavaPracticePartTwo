package ru.frigesty;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

    private final Map<Integer, Game> games = new HashMap<>();
    private int nextKey = 1;

    public void addGame(Game game) {
        games.put(nextKey++, game);
        System.out.println("map.addGame(" + game + ")");
    }

    public void printGames() {
        System.out.println("map.printGames");
        for (var entry : games.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                    ". Game name: " + entry.getValue().getGameName() +
                    ", Developer: " + entry.getValue().getDeveloper() +
                    ", Price: $" + entry.getValue().getPrice() +
                    ", Has DLC: " + entry.getValue().isHaveDLS());
        }
    }

    public void deleteGame(Game game) {
        System.out.println("map.remove(" + game + ")");
        games.entrySet().removeIf(entry -> entry.getValue().equals(game));
    }

    public void findGame(Game game) {
        System.out.println("map.findGame(" + game + ")");
        if (games.containsValue(game)) {
            System.out.println("Game found: " + game.getGameName());
        } else {
            System.out.println("Game not found: " + game.getGameName());
        }
    }

    public void addGameByKey(int key, Game game) {
        if (games.containsKey(key)) {
            System.out.println("Key " + key + " is already in use. Game not added.");
            return;
        }
        games.put(key, game);
        System.out.println("Game added with key " + key + ": " + game.getGameName());
    }

    public void printGameByKey(int key) {
        Game game = games.get(key); // Ищем игру по ключу
        if (game != null) {
            System.out.println("Game with key " + key + ": " + game);
        } else {
            System.out.println("No game found with key " + key);
        }
    }

    public void printKeyByGame(Game value) {
        System.out.println("map.printKeyByGame(" + value + ")");
        for (Map.Entry<Integer, Game> entry : games.entrySet()) {
            if (entry.getValue().equals(value)) {
                System.out.println("Key for the given game: " + entry.getKey());
                return;
            }
        }
        System.out.println("Game not found in the map.");
    }

    public void replaceGameByKey(int key, Game newGame) {
        if (games.containsKey(key)) {
            games.put(key, newGame); // Перезаписываем значение
            System.out.println("Game at key " + key + " has been replaced with: " + newGame.getGameName());
        } else {
            System.out.println("Key " + key + " does not exist. Game not replaced.");
        }
    }
}