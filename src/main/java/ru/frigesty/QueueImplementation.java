package ru.frigesty;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {

    private Queue<Game> games = new LinkedList<>();

    public void addGame(Game game) {
        games.offer(game); // Добавляем игру в конец очереди
        System.out.println("queue.addGame(" + game + ")");
    }


    public void printGames() {
        System.out.println("queue.printGames");

        // Используем do-while цикл для обхода элементов очереди
        if (!games.isEmpty()) {
            var iterator = games.iterator();
            do {
                Game game = iterator.next();
                System.out.println("Game name: " + game.getGameName() +
                        ", Developer: " + game.getDeveloper() +
                        ", Price: $" + game.getPrice() +
                        ", Has DLC: " + game.isHaveDLS());
            } while (iterator.hasNext());
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void deleteGame() {
        Game removedGame = games.poll(); // Удаляем и возвращаем первый элемент из очереди
        if (removedGame != null) {
            System.out.println("queue.removeGame(" + removedGame + ")");
        } else {
            System.out.println("No game to remove. Queue is empty.");
        }
    }

    public void findGame(Game game) {
        System.out.println("queue.findGame(" + game + ")");
        if (games.contains(game)) {
            System.out.println("Game found: " + game.getGameName());
        } else {
            System.out.println("Game not found: " + game.getGameName());
        }
    }

    public void printFirstGame() {
        System.out.println("queue.printFirstGame");
        Game firstGame = games.peek(); // Получаем первый элемент без удаления
        if (firstGame != null) {
            System.out.println("First game in queue: " + firstGame.getGameName());
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void printQueueSize() {
        System.out.println("queue.printQueueSize");
        System.out.println("Queue size: " + games.size());
    }
}