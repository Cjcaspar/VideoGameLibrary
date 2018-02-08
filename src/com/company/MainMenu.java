package com.company;
import java.util.*;

public class MainMenu {
    Scanner scan = new Scanner(System.in);

    public void mainMenu () {
        Functionality f = new Functionality();
        System.out.println("Welcome to the games library!");
        List<Game> library = new ArrayList<>();
        List<Game> out = new ArrayList<>();
        List<Game> all = new ArrayList<>();
        boolean loop = true;


        while (loop) {
            System.out.println("What would you like to do? \n\n1. Add a game to your library\n" +
                    "2. Remove a game from your library\n" +
                    "3. View your game library\n" +
                    "4. Check out a game from your library\n" +
                    "5. Check in a game back into your library\n" +
                    "6. View your games you currently have checked out\n" +
                    "7. View information about games on record\n" +
                    "8. exit. ");
            switch (scan.nextInt()) {
                case 1:
                    Game game = new Game();
                    f.addGame(game, library, all);
                    break;
                case 2:
                    f.removeGame(library);
                    break;
                case 3:
                    f.viewLibrary(library);
                    break;
                case 4:
                    f.checkOut(library, out);
                    break;
                case 5:
                    f.checkIn(library, out);
                    break;
                case 6:
                    f.viewOut(out);
                    break;
                case 7:
                    f.gameInfo(all);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 7");
                    break;
            }
        }

    }
}
