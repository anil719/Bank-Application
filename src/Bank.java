public interface Bank {
    int getBalance();
    String depositMoney(int amount);
    String withDraw(int amount, String enteredPassword);

    double calculateInterest(int time);
}
