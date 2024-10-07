public class BankAccount {

    private double balance;
    private String accountHolder;

    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid Deposti Amount");
        }

    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw: " + amount);
        } else {
            System.out.println(" invalid or insuffiencent fund for withdrawal");
        }
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder:  " + accountHolder + ", Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500, "Weli Ganteng");
        myAccount.deposit(1);
        myAccount.withdraw(100);
        myAccount.displayAccountInfo();
    }

}
