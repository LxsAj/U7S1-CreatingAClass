//Saving Bonds Code
// 1. A person may purchase a bond for any term between 1 and 60 months.
// 2. A bond earns interest every month until its term matures (0 months remaining).
// 3. The term and interest rate are set at the same time.
// Import a Java Scanner
// Properties: Name,Balance, Term, Months Remaining, Interest Rate
// Show the results after bond?
//Else if or case statements
// 4. The bond's interest rate is based on its term according to the following tier system
// 0-11 months = 0.005 %
// 12 - 23 months = 1.0% -> 0.010
// 24 - 35 months = 1.5% -> 0.015%
// 36 - 47 months = 2% = 0.020%
//48 - 60 months = 2.5% = 0.025%

package partA.ex02;

import java.util.Scanner;

public class SavingBond {
    public String name;
    public double balance, rate;
    public int term, monthsRemaining;

    public void TermRate (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Greetings Customer, Which term would you like?");
        System.out.println("Options: ");
        System.out.println("Term 1: 0-11 months");
        System.out.println("Term 2: 12-23 months");
        System.out.println("Term 3: 24-35 months");
        System.out.println("Term 4: 36-47 months");
        System.out.println("Term 5: 48-60 months");
        this.term = sc.nextInt();

        switch (term){
            case 1:
                rate = 0.005;
                monthsRemaining = 11;
                System.out.println("Term Rate for this period is 0.5%");
                break;
            case 2:
                rate = 0.010;
                monthsRemaining = 23;
                System.out.println("Rate is 1%");
                break;
            case 3:
                rate = 0.015;
                monthsRemaining = 35;
                System.out.println("Rate is 1.5%");
                break;
            case 4:
                rate = 0.0020;
                monthsRemaining = 47;
                System.out.println("Rate is 2%");
                break;
            case 5:
                rate = 0.025;
                monthsRemaining = 60;
                System.out.println("Rate is 2.5%");
                break;
            case 6:
                System.out.println("What? Invaild Option");
                break;
        }

    }
    public void earnInterest(){
        if (monthsRemaining > 0){
            balance += balance * rate / 12;
            monthsRemaining --;
            System.out.println("Your balance is: " + balance);
            System.out.println("Your rate is: " + rate);
            System.out.println("The months remaining is: " + monthsRemaining);
        }else{
            System.out.println("Bond is matured");
        }
    }
    public static void main(String[]args ){
        SavingBond bond = new SavingBond();
        bond.TermRate();

        bond.balance = 600.00;

        while (bond.monthsRemaining > 0){
            bond.earnInterest();
        }
    }
}

