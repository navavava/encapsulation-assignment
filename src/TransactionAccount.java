public class TransactionAccount extends BankAccount {

    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest for the account: " + getAccountNumber());
    }

    @Override
    public void withdraw(double amount) {
        if (amount >= 0 && amount <= (balance + overDraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " $ made from the account: " + getAccountNumber());
        } else if (amount < 0)
            System.out.println("You can't make a negative withdrawal.");
        else
            System.out.println("Faqiri");
    }
}
