
package bd.edu.diu;

public class Saving {

    private int accountNo;
    private String title;
    private double balance;
    private double interestRate;

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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Saving(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }

    public Saving() {
    }

    public void showSaving() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Title: " + title);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("******************");
    }

    public static void main(String[] args) {

        Saving savings = new Saving();

        savings.showSaving();

        savings.setAccountNo(1001);
        savings.setTitle("Rahim");
        savings.setBalance(10000);
        savings.setInterestRate(5);

        savings.showSaving();
    }
}