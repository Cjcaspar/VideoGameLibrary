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

    public void setName() {
        System.out.println("What is the name of your game?");
        name = scan.nextLine();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        System.out.println("What is the genre of your game?");
        genre = scan.nextLine();
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear() {
        System.out.println("What year was your game released?");
        releaseYear = scan.nextInt();
    }


}
