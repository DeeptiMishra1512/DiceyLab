import java.util.Random;

public class Dice {

 int numOfDice = 0;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }


    public Integer tossAndSum(){
        int dice1=(int)(Math.random()*6+1);
        int dice2 = (int) (Math.random() *6+1);

        int sum = dice1+dice2;

        return sum;
    }

}
