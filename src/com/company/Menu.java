package com.company;
import java.util.*;

public class Menu {

    public void mainMenu() {
        /**You don't want a functionality class for this communication; you want all of these to be the responsibility of the library-itself.
         * Just like in real life, a library adds, removes, checks in, and checks out things. Also, better naming conventions as 'f' isn't verbose
         * Personally, I'd use the library class for instantiating and displaying the menu, also, as it should be its job to give you options. Using the
         * library as the aggregator of all classes to perform its job of adding, removing, checking in, and checking out games.*/

                System.out.println("What would you like to do? \n\n1. Add a game to your library\n" +
                        "2. Remove a game from your library\n" +
                        "3. View your game library\n" +
                        "4. Check out a game from your library\n" +
                        "5. Check in a game back into your library\n" +
                        "6. View your games you currently have checked out\n" +
                        "7. View information about games on record\n" +
                        "8. exit. ");

            }

            public void welcome() {
        System.out.println("Welcome to the games library!");

            }

        }