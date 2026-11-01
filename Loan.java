
package bd.edu.diu;

public class Loan {

    private int loanId;
    private String customerName;
    private double loanAmount;
    private double interestRate;

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Loan(int loanId, String customerName) {
        this.loanId = loanId;
        this.customerName = customerName;
    }

    public Loan() {
    }

    public void showLoan() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("************");
    }

    public static void main(String[] args) {

        Loan loans = new Loan();

        loans.showLoan();

        loans.setLoanId(101);
        loans.setCustomerName("Sadia");
        loans.setLoanAmount(5000);
        loans.setInterestRate(12);
        loans.showLoan();
    }
}