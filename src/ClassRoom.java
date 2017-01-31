import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by BHarris on 1/30/17.
 *
 * This is a classroom class that looks at students and teachers, it also takes into account temperature of the room,
 * and other comforts students and teachers may need.
 */
public class ClassRoom {
    private int numberOfStudents;
    ArrayList<String> studentNames;
    private int numberOfChairs;
    private String instructor;
    private boolean whiteboard;
    private int temperature;
    private final int DEFAULT_TEMP = 70;

    public ClassRoom(String teacher, int numberOfStudents, boolean whiteboard){
        this.instructor = teacher;
        this.numberOfStudents = numberOfStudents;
        this.whiteboard = whiteboard;
        this.studentNames = new ArrayList<>();
        this.temperature = DEFAULT_TEMP;
        this.numberOfChairs = numberOfStudents + 1; //teachers need a chair too
    }
    //allows for number of chairs to be added. And temperature to be adjusted.
    public ClassRoom(String teacher, int numberOfStudents, boolean whiteboard, int temperature, int numberOfChairs){
        this.instructor = teacher;
        this.numberOfStudents = numberOfStudents;
        this.whiteboard = whiteboard;
        this.studentNames = new ArrayList<>();
        this.numberOfChairs = numberOfChairs; //in case there is going to be a guest

        if(checkTemperature(temperature)) {
            this.temperature = temperature;
        }else{
            this.temperature = DEFAULT_TEMP;
        }
    }


    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public boolean isWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(boolean whiteboard) {
        this.whiteboard = whiteboard;
    }

    public int getTemperature() {
        return temperature;
    }

    //this requires the temp to be between 0 and 100 degrees.  If not it won't be changed from the initialized value of
    //70 degrees that is set at initialization at default.

    public boolean checkTemperature(int temperature) {
        if(temperature > 0 && temperature < 100) {
            return true;
        }
        return false;
    }
    public void setTemperature(int temperature) {
       if(checkTemperature(temperature)) {
           this.temperature = temperature;
       }else{
           this.temperature = DEFAULT_TEMP;
       }
    }

    public void setStudent(String student){
        studentNames.add(student);
    }

    public void getStudent(){
        for (String student : this.studentNames){
            System.out.println(student);
        }
    }

    public String toString(){
        return "" + "Classroom is " + this.temperature + " degress, with " + this.numberOfStudents + "and " +
                + this.numberOfChairs + " chairs" + " students" + " and your instructor is " + this.instructor;
    }

    public static void main(String[] args) {
        ClassRoom class1 = new ClassRoom("Blake",12,true ,65, 15);
        System.out.println(class1.getTemperature());
    }

}

