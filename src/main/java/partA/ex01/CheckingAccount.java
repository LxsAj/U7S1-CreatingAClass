package partA.ex01;

public class CheckingAccount {
    public String name;
    public double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount < 0) {
            System.out.println("Invaild Amount. Try again");
        } else if (balance < amount) {
            System.out.println("Balance too low to make withdrawl");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Final balance is: " + balance);
        }
    }

    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.name = "User";
        account.balance = 600.00;

        account.deposit(50);
        System.out.println("Customer: " + account.name);
        System.out.println("Balance after deposit: " + account.balance);

        account.withdrawal(100);
        System.out.println("Balance after withdrawal: " + account.balance);
    }
}
