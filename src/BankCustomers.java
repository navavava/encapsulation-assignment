import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println(account.getAccountHolderName() + ", " + account.getAccountNumber() + ", " + account.getBalance() + " $");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println(account.getAccountHolderName() + ", " + account.getAccountNumber() + ", " + account.getBalance() + " $");
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
