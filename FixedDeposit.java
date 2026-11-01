
package bd.edu.diu;

public class FixedDeposit {

    private int accountNo;
    private String title;
    private double balance;
    private double interestRate;
    private int duration;

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public FixedDeposit(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }

    public FixedDeposit() {
    }

    public void showFixedDeposit() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Title: " + title);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Duration: " + duration + " 5");
        System.out.println("*************");
    }

    public static void main(String[] args) {

        FixedDeposit deposits = new FixedDeposit();

        deposits.showFixedDeposit();

        deposits.setAccountNo(1002);
        deposits.setTitle("Esrat");
        deposits.setBalance(5000);
        deposits.setInterestRate(7);
        deposits.setDuration(3);

        deposits.showFixedDeposit();
    }
}