//A person may purchase a bond for any term between 1 and 60 months
// A bond earns interest every month until its term matures (0 months remaining)
//The term and interest rate are set at the same time
//The bond’s interest rate is based on its term according to the following tier system.


package partA.ex02;

public class SavingBond {
    public String name;
    public double balance, rate;
    public int term, monthsRemaining;


    public void TermRate(int t) {
        if (t >= 0 && t <= 11) {
            rate = 0.005;
        } else if (t>=12 && t<=23) {
            rate = 0.010;
        }
    }
}