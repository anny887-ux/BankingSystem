
package bd.edu.diu;

public class Installment {

    private int installmentId;
    private double amount;
    private String dueDate;
    private String status;

    public int getInstallmentId() {
        return installmentId;
    }

    public void setInstallmentId(int installmentId) {
        this.installmentId = installmentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Installment(int installmentId, double amount) {
        this.installmentId = installmentId;
        this.amount = amount;
    }

    public Installment() {
    }

    public void showInstallment() {
        System.out.println("Installment ID: " + installmentId);
        System.out.println("Amount: " + amount);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Status: " + status);
        System.out.println("************");
    }

    public static void main(String[] args) {

        Installment installments = new Installment();

        installments.showInstallment();

        installments.setInstallmentId(1);
        installments.setAmount(5000);
        installments.setDueDate("01-12-2026");
        installments.setStatus("Paid");

        installments.showInstallment();
    }
}