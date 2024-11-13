import java.util.HashMap;

public class Bins {

    HashMap<Integer, Integer> binMap = new HashMap<>();


    Dice dice = new Dice(2);
    Integer toss = dice.tossAndSum();


    public Integer incrementBin(Integer toss) {

        if(binMap.containsKey(toss)){
           Integer existingVal = binMap.get(toss);
           binMap.replace(toss,existingVal+1);
        }
        else {
            binMap.put(toss,1);
        }
            return binMap.get(toss);
    }

    public Integer getBin(Integer tossValue){

        return binMap.get(tossValue);
    }

}