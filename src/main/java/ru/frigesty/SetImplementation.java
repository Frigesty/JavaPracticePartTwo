package ru.frigesty;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class SetImplementation {

    private final Set<Game> games = new HashSet<>();

    public void addGame(Game game) {
        games.add(game);
        System.out.println("set.addGame(" + game + ")");
    }

    public void printGames() {
        System.out.println("set.printGames");
        Iterator<Game> iterator = games.iterator();

        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println("Game name: " + game.getGameName() +
                    ", Developer: " + game.getDeveloper() +
                    ", Price: $" + game.getPrice() +
                    ", Has DLC: " + game.isHaveDLS());
        }
    }

    public void deleteGame(Game game) {
        boolean removed = games.remove(game);
        if (removed) {
            System.out.println("set.removeGame(" + game + ")");
        } else {
            System.out.println("Game not found: " + game.getGameName());
        }
    }

    public void findGame(Game game) {
        System.out.println("set.findGame(" + game + ")");
        if (games.contains(game)) {
            System.out.println("Game found: " + game.getGameName());
        } else {
            System.out.println("Game not found: " + game.getGameName());
        }
    }

    public void printSetSize() {
        System.out.println("set.printSetSize");
        System.out.println("Set size: " + games.size());
    }
}