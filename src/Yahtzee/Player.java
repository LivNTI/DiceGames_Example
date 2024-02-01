package Yahtzee;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Dice> pickedDice = new ArrayList<Dice>();
    Scanner scan = new Scanner(System.in);
    private String name;
    private ScoreCard myScoreCard;


    public Player() {
        getInfo();
    }


    private void getInfo() {
        while (true) {
            try {

                System.out.print("What is your name? ");
                this.name = scan.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }
    }


}
