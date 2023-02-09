import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Password and Initial Balance " ) ;
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount AnilAccount = new SBIAccount(name, balance, password);

        System.out.println("Your account has been created with Account Number : " + AnilAccount.getAccountNumber());


        // getBalance
        System.out.println("your current balance is :  "+ AnilAccount.getBalance());

        //depositMoney
        System.out.println("Enter amount u want to deposit " );
        int amt = sc.nextInt();
        System.out.println(AnilAccount.depositMoney(amt));

        // withdrawMoney
        System.out.println("enter Amount u want to withDraw ");
        int amount = sc.nextInt();
        System.out.println("enter your password for proceeding");
        String enteredPassword = sc.next();
        System.out.println(AnilAccount.withDraw(amount, enteredPassword));

        //interest
        System.out.println("Interest for 3 years on current balance " + AnilAccount.getBalance() + "is " + AnilAccount.calculateInterest(3));

    }
}