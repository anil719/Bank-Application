import java.util.UUID;

public class HDFCAccount implements Bank{
    private String name;
    private String keyword;
    private int initialBalance;
    private String accountNum;
    private double interest;


    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public HDFCAccount(String name, String keyword, int initialBalance) {
        this.name = name;
        this.keyword = keyword;
        this.initialBalance = initialBalance;
        this.interest = 7.0 ;
        this.accountNum = String.valueOf(UUID.randomUUID()) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String depositMoney(int amount) {
        return null;
    }

    @Override
    public String withDraw(int amount, String enteredPassword) {
        return null;
    }

    @Override
    public double calculateInterest(int time) {
        return 0;
    }
}
