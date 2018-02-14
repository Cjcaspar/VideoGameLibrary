package com.company;
import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);

    private String name;
    private String genre;
    private int releaseYear;

    public Game(String name, String genre, int releaseYear) {
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public Game() {
        setName();
        setGenre();
        setReleaseYear();
    }

    public String getName() {
        return name;
    }

    public void setName()
    {   /**This logic should be in the library, as it's a library's responsibility to ask you which game you should add to it. The responsibility of a setter
     is literally to only set. 0 logic, otherwise.*/
        System.out.println("What is the name of your game?");
        name = scan.nextLine();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        /**Also should be responsibility of library class. */
        System.out.println("What is the genre of your game?");
        genre = scan.nextLine();
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear() {
        /**Also should be responsibility of library class. */
        System.out.println("What year was your game released?");
        releaseYear = scan.nextInt();
    }


}
