import javax.xml.crypto.dsig.TransformService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TransactionAccount transOne = new TransactionAccount("1", "Nima", 200);
        TransactionAccount transTwo = new TransactionAccount("2", "Pariya", 250);
        TransactionAccount transThree = new TransactionAccount("3", "Nika", 150);
        SavingAccount savingsOne = new SavingAccount("4", "Asal", 310);
        SavingAccount savingsTwo = new SavingAccount("5", "Elahe", 100);
        SavingAccount savingsThree = new SavingAccount("6", "Narges", 200);

        BankCustomers Bank = new BankCustomers();
        Bank.addAccount(transOne);
        Bank.addAccount(transTwo);
        Bank.addAccount(transThree);
        Bank.addAccount(savingsOne);
        Bank.addAccount(savingsTwo);
        Bank.addAccount(savingsThree);

        Bank.findAccount("6");
        Bank.findAccount("7");
        System.out.println(transThree.getBalance());
        transThree.deposit(300);
        System.out.println(transThree.getBalance());
        transTwo.deposit(-20);
        transOne.calculateInterest();
        savingsOne.calculateInterest();
        savingsTwo.withdraw(10);
        savingsTwo.withdraw(-10);
        savingsTwo.withdraw(150);
        transThree.withdraw(10);
        transThree.withdraw(-10);
        transThree.withdraw(1000);
        System.out.println("******************");
        Bank.showAllBalances();
    }
}