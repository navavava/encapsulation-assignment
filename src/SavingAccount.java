public class SavingAccount extends BankAccount {

    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = interestRate * super.balance;
        deposit(interest);
//        System.out.println("Interest deposit of " + interest + " $ was added to the account:" + getAccountNumber());
    }
}
