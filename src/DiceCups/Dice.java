package DiceCups;

import java.util.Random;

public class Dice {
    String color;
    int sides;
    int currentSide;
    Random rand = new Random();
    boolean inCup = false;

    public Dice(String color, int sides) {
        this.color = color;
        this.sides = sides;
        rollDice();
    }

    public void rollDice() {
        currentSide = rand.nextInt(sides) + 1;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public void getPicked() {
        inCup = true;
    }
}
