/**
 * Created by BHarris on 1/30/17.
 *
 * A bank account where you can create a name with an initial balance, and have a user enter a 4 character pin
 * account number.
 *
 */
public class BankAccount {
    //private because these do not need to be accessed from other classes.
    private String accountPin;
    private double initialBalance;
    private String name;
    private String typeOfBusiness;
    private static int DEFAULT_BALANCE = 0;

    public BankAccount(String name, double initialBalance, String accountNumber){
        this.name = name;
        this.initialBalance = initialBalance;
        this.accountPin = accountNumber;
        this.typeOfBusiness = "Personal";
    }

    public BankAccount(String name, String accountNumber){
        this.name = name;
        this.initialBalance = DEFAULT_BALANCE;
        this.accountPin = accountNumber;
        this.typeOfBusiness = "Personal";

    }

    public String getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(String accountPin) {
        if(accountPin.length() == 4) {
            this.accountPin = accountPin;
        }
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        if(initialBalance > 0) {
            this.initialBalance = initialBalance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void addMoney(int money) {
        if (money > 0) {
            this.initialBalance += money;
        }
    }

    public void subtractMoney(int money) {
        if(this.initialBalance - money >= 0){
            this.initialBalance -= money;
        }
    }

    public String instructions(){
        return "Enter your whole name, initial balance you are depositing, and a 4 digit ATM pin.";

    }

    public String toString(){
        return "" + "name: " + name + " initial balance: " + initialBalance +
                " accountPin " + accountPin;
    }
}
