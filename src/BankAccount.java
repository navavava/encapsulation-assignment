abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " $ made to the account: " + accountNumber);
        } else
            System.out.println("You can't make a negative deposit.");
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount<= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " $ made from the account: " + accountNumber);
        } else if(amount < 0)
            System.out.println("You can't make a negative withdrawal.");
        else
            System.out.println("Faqiri");
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }
}
