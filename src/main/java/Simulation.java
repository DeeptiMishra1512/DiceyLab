public class Simulation {
   int numOfDice = 0;
   int numOfTosses = 0;
    Integer totalSum =0;
    Integer resultToss=0;
    Integer sum =0;
    Bins bins = new Bins();

    public Simulation(int numOfDice,int numOfToss) {
        this.numOfDice = numOfDice;
        this.numOfTosses = numOfToss;
    }


    public static void main(String args[]){
       Simulation sim = new Simulation(2,10000);
        sim.simulate();
        sim.printResult();
        System.out.println("\n");
        Simulation sim1 = new Simulation(5,10000);
        sim1.simulate();
        sim1.printResult();
    }




    public void simulate(){
        Dice dice = new Dice(numOfDice);


     for(int i=1; i<numOfTosses; i++) {

         sum = dice.tossAndSum();
         bins.incrementBin(sum);

     }
     //return bins.incrementBin(sum);
    }


    public void printResult(){
        for(int i=2 ; i<=12; i++) {
            System.out.println(i + " : " + bins.getBin(i));
        }
    }

}
