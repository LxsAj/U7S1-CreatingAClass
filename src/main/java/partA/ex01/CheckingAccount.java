package partA.ex01;

public class CheckingAccount {
    public double curBalance;
    public String name;

public void withdrawal(int amount){
    curBalance -= amount;
}

    public void displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: " + curBalance);
    }

    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.name = "Johnny";
        account.curBalance = 600.00;
        account.withdrawal(50);
        account.displayCustomer();
    }
}

