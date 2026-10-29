package ATM;

class international extends atm {
    international(double balance, int pin) {
        super(balance, pin);
    }
    
    @Override
    public void withdrawAmount(int pin, double amount) {
        System.out.println("International ATM");
        
        double fee = 2;
        
        if (this.pin == pin) {
            balance -= (amount + fee);
            System.out.println("Withdrawn amount " + amount + " successfully");
            System.out.println("The balance is " + balance);
        } else {
            System.out.println("Incorrect pin");
        }
    }
}
