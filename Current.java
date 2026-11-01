
package bd.edu.diu;

public class Current {

    private int accountNo;
    private String title;
    private double balance;
    private double minimumBalance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Current(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }

    public Current() {
    }
public void showCurrent() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Title: " + title);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("******************");
    }

    public static void main(String[] args) {

        Current current = new Current();

        current.showCurrent();

        current.setAccountNo(1003);
        current.setTitle("Orin");
        current.setBalance(2000000);
        current.setMinimumBalance(50000);
         current.showCurrent();
    }
}