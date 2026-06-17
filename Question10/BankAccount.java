package Question10;

public class BankAccount {
    private double balance = 10000;

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Invalid Withdrawal");
        }
    }

    public void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}
