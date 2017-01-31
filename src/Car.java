/**
 * Created by BHarris on 1/30/17.
 * 4 wheel car class, no motorcycles in this one.  Takes in various information about the car, and calculates gas mileage
 * for highway rounded to integer.
 */
public class Car {
    private int numberOfWheels;
    private double gasMileageHighway;
    private String brand;
    private String model;
    private int year;

    //only cars, can't pass in number of wheels.
    public Car(String brand, String model, int year, int gasMileageHighway){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfWheels = 4;
        this.gasMileageHighway = gasMileageHighway;
    }

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfWheels = 4;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getGasMileageHighway() {
        return gasMileageHighway;
    }

    public void setGasMileageHighway(double gasMileageHighway) {
        this.gasMileageHighway = gasMileageHighway;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void calculateHighwayMileage(int milesDriven, int tankSize){

        this.gasMileageHighway = milesDriven / tankSize;
    }


    public String toString(){
        return "You Drive a " + this.year + " " + this.brand + " " + this.model + " with " +
                this.gasMileageHighway + " miles to the gallon";
    }


}
