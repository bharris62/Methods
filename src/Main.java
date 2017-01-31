import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Testing out my BankAccount class.
        System.out.println("Output for BankAccount Class");
        BankAccount bank = new BankAccount("Blake Harris", 1000,"1234");
        bank.addMoney(50);
        System.out.println(bank);
        bank.subtractMoney(100);
        System.out.println(bank);
        bank.subtractMoney(3000);
        System.out.println(bank);
        System.out.println("--------------------------------------------");

        System.out.println("Output for BasketballTeam class");
        BasketballTeam team = new BasketballTeam("Dogs");

        //prints array in [] format, has null if no player added.
        team.setPlayer("Adam");
        team.setPlayer("Andy");
        System.out.println(team.getPlayer());
        team.setPlayer("Andrew");
        team.setPlayer("Arnold");
        team.setPlayer("Ansley");
        System.out.println(team.getPlayer());
        team.setPlayer("Cole");

        team.addAssists(5000);
        team.addPoints(400);
        System.out.println("assists = " + team.getAssists() + " points = " + team.getPoints());
        System.out.println("--------------------------------------------");


        System.out.println("Output for EasyMath class");
        EasyMath easy = new EasyMath();
        Scanner scanner = new Scanner(System.in);
        //loop until user enters a '-1'
        while(true) {
            System.out.printf("Enter an int number(-1 to exit): ");
            int num = Integer.parseInt(scanner.nextLine());

            if(num == -1) {
                break;
            }
            easy.setNumber(num);
        }
        System.out.println(easy.getSum());
        System.out.println(easy.getAverage());
        System.out.println("--------------------------------------------");

        System.out.println("Output for Car class");
        Car car = new Car("Honda", "Accord", 2015);
        car.calculateHighwayMileage(55,15);

        System.out.println(car);
        System.out.println("--------------------------------------------");

        System.out.println("Output for classroom class");
        ClassRoom classroom = new ClassRoom("John", 9, true);

        classroom.setStudent("Blake");
        classroom.setStudent("Matt");

        classroom.getStudent();
        System.out.println(classroom);


    }
}
