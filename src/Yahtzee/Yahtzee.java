package Yahtzee;

import java.util.ArrayList;
import java.util.Scanner;

public class Yahtzee {
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Dice> allDice = new ArrayList<Dice>();
    private ScoreCard scoreboard; //TODO: shoudl each player have their own scoreboard?
    Scanner scan = new Scanner(System.in);
    private int noOfPlayers;
    private Rules rules = new Rules();

    public Yahtzee() {
        createPlayers();
        createDice();
    }

    private void createDice() {

        for (int i = 0; i < 5; i++) {
            allDice.add(new Dice());
        }

    }

    private void createPlayers() {
        while (true) {
            try {
                System.out.println("How many players are playing? Max amount is 4");
                noOfPlayers = scan.nextInt();
                if (noOfPlayers < 1 || noOfPlayers > 4) {
                    throw new Exception("Invalid amount of players");
                }
                scan.nextLine();
                for (int i = 0; i < noOfPlayers; i++) {
                    players.add(new Player());
                }
                break;
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Please enter a number between 1 and 4");
            }
        }
    }

    private void startGame() {

    }

}
