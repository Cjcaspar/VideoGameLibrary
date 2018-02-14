package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    Scanner scan = new Scanner(System.in);

    Menu menu = new Menu();
    List<Game> library = new ArrayList<>();
    List<Game> out = new ArrayList<>();
    List<Game> all = new ArrayList<>();

    public void addGame(Game game, List<Game> library, List<Game> all) {
        library.add(game);
        all.add(game);
        System.out.println(game.getName() + " has been added to your library");
    }

    public void removeGame(List<Game> library) {

        if (library.size() <= 0) {
            System.out.println("You have no games in your library.");
        } else {

            System.out.println("Which game would you like to remove from your library?\n");
            for (int i = 0; i < library.size(); i++) {
                Game game = library.get(i);
                System.out.println((i + 1) + ". " + game.getName());
            }
            int gameNum = -1;
            do {
                try {
                    gameNum = scan.nextInt();
                } catch (Exception e) {
                    System.out.println("Please enter a number corresponding to a game on the list");
                }
            } while (gameNum < 0 || gameNum >= (library.size() + 1));
            library.remove(gameNum - 1);
        }
    }

    public void viewLibrary(List<Game> library) {

        if (library.size() <= 0) {
            System.out.println("You have no games in your library");
        } else {

            System.out.println("These are the current games in the library:");

            for (int i = 0; i < library.size(); i++) {
                Game game = library.get(i);
                System.out.println((i + 1) + ". " + game.getName());
            }

            System.out.println("\n");
        }
    }

    public void checkOut(List<Game> library, List<Game> out) {

        if (library.size() <= 0) {
            System.out.println("You have no games in your library.");
        } else {
            System.out.println("Which game would you like to checkout from your library?\n");

            for (int i = 0; i < library.size(); i++) {
                Game game = library.get(i);
                System.out.println((i + 1) + ". " + game.getName());
            }


            int gameNum = scan.nextInt();
            Game outList = new Game(" ", " ", 0);
            outList = library.get(gameNum - 1);
            out.add(outList);
            library.remove(gameNum - 1);

            System.out.println(outList.getName() + " has been checked out.");
        }
    }

    public void checkIn(List<Game> library, List<Game> out) {

        if (out.size() <= 0) {
            System.out.println("You have no games to check in.");
        } else {

            System.out.println("Which game would you like to check into your library?\n");

            for (int i = 0; i < out.size(); i++) {
                Game game = out.get(i);
                System.out.println((i + 1) + ". " + game.getName());
            }

            int gameNum = scan.nextInt();
            Game inList = new Game(" ", " ", 0);
            inList = out.get(gameNum - 1);
            library.add(inList);
            out.remove(gameNum - 1);

            System.out.println(inList.getName() + " has been checked into your library");
        }
    }

    public void viewOut(List<Game> out) {

        if (out.size() <= 0) {
            System.out.println("You have no games checked out.");
        } else {

            System.out.println("These are the current games you have checked out\n");

            for (int i = 0; i < out.size(); i++) {
                Game game = out.get(i);
                System.out.println((i + 1) + ". " + game.getName());
            }

        }
    }

    public void gameInfo(List<Game> all) {

        if (all.size() <= 0) {
            System.out.println("You have no games on record");
        } else {

            System.out.println("Which game do you want to know about?\n");

            for (int i = 0; i < all.size(); i++) {
                Game game = all.get(i);
                System.out.println((i + 1) + ". " + game.getName());
            }

            int gameNum = scan.nextInt();
            Game info = new Game(" ", " ", 0);
            info = all.get(gameNum - 1);
            System.out.println(info.getName() + " is part of the " + info.getGenre() + " genre, and was released in the year " + info.getReleaseYear());
        }
    }

    public void menuSelect() {
        Menu menu = new Menu();
        menu.welcome();
        menu.mainMenu();
        String input = scan.nextLine();


        switch(input) {
            case "1":
                Game game = new Game(gameName(), gameGenre(), gameYear());
                addGame(game, library, all);
                menuSelect();
                break;
            case "2":
                removeGame(library);
                menuSelect();
                break;
            case "3":
                viewLibrary(library);
                menuSelect();
                break;
            case "4":
                checkOut(library, out);
                menuSelect();
                break;
            case "5":
                checkIn(library, out);
                menuSelect();
                break;
            case "6":
                viewOut(out);
                menuSelect();
                break;
            case "7":
                gameInfo(all);
                menuSelect();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("Please enter a number 1 through 8.");
                menuSelect();

        }
    }

    public String gameName() {
        System.out.println("What is the name of your game?");
        return scan.nextLine();
    }

    public String gameGenre() {
        System.out.println("What is the genre of your game?");
        return scan.nextLine();
    }

    public int gameYear() {
        System.out.println("What year was your game released?");
        return scan.nextInt();
    }

}
