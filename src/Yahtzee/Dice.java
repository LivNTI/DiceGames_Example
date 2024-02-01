package Yahtzee;

import java.util.Random;

public class Dice {
    private final int sides = 6;
    private int currentSide = 1;
    private Random rand = new Random();
    private boolean picked = false;

    public Dice() {
    }

    public int rollDice() {
        this.currentSide = rand.nextInt(sides) + 1;
        return this.currentSide;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public void getPicked() {
        this.picked = true;
    }
}
