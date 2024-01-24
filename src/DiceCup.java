public class DiceCup extends DiceSet {
    DiceSet allDice;

    public DiceCup(int noDice, DiceSet allDice) {

        super(noDice);
        this.allDice = allDice;
    }

    public void pickDice() {
        Dice myDie;

        do {
            int choice = rand.nextInt(allDice.noDice);
            myDie = allDice.myDice.get(choice);
        } while (myDie.inCup == true);

        myDice.add(myDie);
    }

    public void calculateValue() {
        int sum = 0;
        for (Dice die : myDice) {
            System.out.println(die.currentSide);
            System.out.println(die.color);
            sum += die.currentSide;

        }
        System.out.println(sum);
    }


}
