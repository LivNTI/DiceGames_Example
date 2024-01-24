import java.util.ArrayList;
import java.util.Random;

public class DiceSet {
    ArrayList<Dice> myDice = new ArrayList<Dice>();
    protected int noDice;
    protected Random rand = new Random();
    String[] colors = {"red", "Yellow", "blue", "green"};

    public DiceSet(int noDice) {
        this.noDice = noDice;
    }

    public void generateDice() {
        for (int i = 0; i < 10; i++) {
            int randInt = rand.nextInt(1, 21);
            int color = rand.nextInt(colors.length);

            myDice.add(new Dice(colors[color], randInt));
        }
    }


}
