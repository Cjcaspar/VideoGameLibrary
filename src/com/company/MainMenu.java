package com.company;
import java.util.Scanner;

public class MainMenu {
    Scanner scan = new Scanner(System.in);

    public void mainMenu () {
        System.out.println("Welcome to the games library, what would you like to do?");

        switch(scan.nextInt()) {
            case 1:
                addGame();
            case 2:
                removeGame();
            case 3:
                viewLibrary();
            case 4:
                checkOut();
            case 5:
                checkIn();
            case 6:
                viewOut();
            case 7:
                System.exit(0);
            default:
                System.out.println("Please enter a number between 1 and 7");
        }
    }


}
