package ATM;


class atm {
    protected double balance; // private variable 
    protected int pin;
    String name;

    // constructor 
    public atm(double initbalance, int initpin) {
        this.balance = initbalance;
        this.pin = initpin;
    }

    public double getBalance(int enteredPin) {
        if (this.pin == enteredPin) {
            return balance;
        } else {
            System.out.println("Incorrect pin access denied !!!");
            return -1;
        }
    } 

    public void withdrawAmount(int enteredPin, double amount) {
        if (pin == enteredPin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn amount " + amount + " successfully");
                System.out.println("Remaining balance " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Incorrect pin !! Access denied");
        }
    }

    // polymorphism overloading
    public void withdrawAmount(int enteredPin, double amount, String reason) {
        System.out.println("Transaction for " + reason);
        withdrawAmount(enteredPin, amount);
    }

    public void deposit(int enteredPin, double amount) {
        if (this.pin == enteredPin) {
            balance += amount;
            System.out.println("The amount " + amount + " successfully deposited");
            System.out.println("The current balance is " + balance);
        }
    }
}