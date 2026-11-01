
package bd.edu.diu;

public class AccountTransfer {

    private int transferId;
    private int fromAccount;
    private int toAccount;
    private double amount;

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public int getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(int fromAccount) {
        this.fromAccount = fromAccount;
    }

    public int getToAccount() {
        return toAccount;
    }

    public void setToAccount(int toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountTransfer(int transferId, int fromAccount, int toAccount) {
        this.transferId = transferId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public AccountTransfer() {
    }

    public void showTransfer() {
        System.out.println("Transfer ID: " + transferId);
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
        System.out.println("Amount: " + amount);
        System.out.println("******************");
    }

    public static void main(String[] args) {

        AccountTransfer transfers = new AccountTransfer();

        transfers.showTransfer();

        transfers.setTransferId(101);
        transfers.setFromAccount(1001);
        transfers.setToAccount(1002);

        transfers.showTransfer();

        transfers.setAmount(2000);

        transfers.showTransfer();
    }
}