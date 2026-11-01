package bd.edu.diu;

public class Transaction {

    private int transactionId;
    private String type;
    private double amount;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction(int transactionId, String type) {
        this.transactionId = transactionId;
        this.type = type;
    }

    public Transaction() {
    }

    public void showTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("************************");
    }

    public static void main(String[] args) {

        Transaction transactions = new Transaction();

        transactions.showTransaction();

        transactions.setTransactionId(1001);
        transactions.setType("Deposit");

        transactions.showTransaction();

        transactions.setAmount(5000);
        transactions.showTransaction();
    }
}