import java.util.ArrayList;

/**
 * Created by BHarris on 1/30/17.
 *
 * This is a basic class that does some basic math.  We will assume the Math class doesn't exist and we are trying to redo
 * it completely.
 */
public class EasyMath {
    private int sum;
    private double average;
    private ArrayList<Integer> numbers;

    public EasyMath() {
        this.numbers = new ArrayList<>();
    }

    public void setNumber(int number){
        this.numbers.add(number);
    }

    public int getSum(){

        for(int number : this.numbers) {
            this.sum += number;
        }
        return this.sum;
    }

    public double getAverage(){
        this.average =  (double)this.sum/numbers.size();
        return this.average;
    }
}
