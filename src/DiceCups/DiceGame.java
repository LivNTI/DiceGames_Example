package DiceCups;

public class DiceGame {
    DiceSet allDice;
    DiceCup cup1;
    DiceSet cup2;

    public DiceGame() {
        startGame();
    }

    private void startGame() {
        allDice = new DiceSet(10);
        cup1 = new DiceCup(0, allDice);
        //cup2 = new DiceCups.DiceSet(0);
        allDice.generateDice();

        cup1.pickDice();
        cup1.pickDice();
        cup1.pickDice();
        cup1.pickDice();
        cup1.calculateValue();
    }


}
