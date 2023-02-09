import java.util.UUID;

public class SBIAccount implements Bank{
    private String name;
    private String accountNumber;
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest = 6.6;
        this.accountNumber = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance ;
    }

    @Override
    public String depositMoney(int amount) {
         this.balance += amount;
         return "Added an amount of " + amount + " Successfully " ;
    }

    @Override
    public String withDraw(int amount, String enteredPassword) {

        if(enteredPassword.equals(this.password)){
            if(amount > this.balance) return "Insufficient Balance to withDraw " ;
            else {
                this.balance -= amount ;
                return "Money Deducted " ;
            }
        }else {
            return "password Incorrect " ;
        }

    }

    @Override
    public double calculateInterest(int time) {
        return (balance * rateOfInterest * time)/100.0 ;
    }
}
