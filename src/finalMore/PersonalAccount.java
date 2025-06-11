package finalMore;

public class PersonalAccount implements Account{
    int accountId;
    String owner;
    double balance;

    public PersonalAccount(int accountId, String owner, double balance) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
