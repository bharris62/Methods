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
    private int modulo;
    private int floor;

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
        this.average =  (double)this.sum / numbers.size();
        return this.average;
    }

    public void computeModulo(int numerator, int denominator){
        this.modulo = numerator%denominator;
    }

    public int getModulo(){
        return this.modulo;
    }

    public int getFloor(){
        int lowest = numbers.get(0);
        for(int i : numbers){
            if(i < lowest) {
                lowest = i;
            }

        }
        return lowest;
    }

    public int getCeiling(){
        int highest = numbers.get(0);
        for(int i : numbers){
            if(i > highest) {
                highest = i;
            }

        }
        return highest;
    }

    public int getMin(int a, int b){
        if (a < b) {
            return a;
        }
        return b;
    }

    public int getMax(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        EasyMath math = new EasyMath();
        math.setNumber(4);
        math.setNumber(2);
        math.setNumber(10);
        math.setNumber(20);
        System.out.println(math.getFloor());
        System.out.println(math.getCeiling());
        System.out.println(math.getMax(3,2));
        System.out.println(math.getMin(3,2));

    }
}
