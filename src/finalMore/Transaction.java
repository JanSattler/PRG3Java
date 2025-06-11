package finalMore;

public class Transaction {
    String type;
    int fromAccount;
    int toAccount;
    double amount;

    public Transaction(String type, int fromAccount, int toAccount, double amount) {
        if (type.equals("transfer")) {
            this.type = type;
            this.fromAccount = fromAccount;
            this.toAccount = toAccount;
            this.amount = amount;
        } else if (type.equals("deposit")) {
            this.type = type;
            this.toAccount = toAccount;
            this.amount = amount;
        } else {
            this.type = type;
            this.fromAccount = fromAccount;
            this.amount = amount;
        }

    }

    public String getType() {
        return type;
    }

    public int getFromAccount() {
        return fromAccount;
    }

    public int getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", amount=" + amount +
                '}';
    }
}
