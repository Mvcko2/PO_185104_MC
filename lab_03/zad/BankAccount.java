package zad;
public class BankAccount {
    private String owner;
    private double balance;


    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
        else{
            System.out.println("kwota jest ujemna, lub brak wystarczajacych srodkow na koncie");
        }
    }
}