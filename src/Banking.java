/**
 * Created by BHarris on 1/30/17.
 *
 * A basic bank where you can create a name with an initial balance, and generate a random 4 digit
 * account number.
 *
 * Also a add money and subtract money method are added.  add and subtract will not be allowed if there is
 * not enough money in the account.  All accounts are personal, not business.
 */
public class Banking {
    //private because these do not need to be accessed from other classes.
    private String accountNumber;
    private double initialBalance;
    private String name;
    private String typeOfBusiness;
    private static int DEFAULT_BALANCE = 0;

    public Banking(String name, double initialBalance, String accountNumber){
        this.name = name;
        this.initialBalance = initialBalance;
        this.accountNumber = accountNumber;
        this.typeOfBusiness = "Personal";

    }

    public Banking(String name, String accountNumber){
        this.name = name;
        this.initialBalance = DEFAULT_BALANCE;
        this.accountNumber = accountNumber;
        this.typeOfBusiness = "Personal";

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
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

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
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
        return "Enter your whole name, initial balance you are depositing, and your date of birth, plus" +
                "first and last name initial ex 12181990bh";

    }

    public String toString(){
        return "" + "name: " + name + " initial balance: " + initialBalance +
                " accountNumber " + accountNumber;
    }
}
