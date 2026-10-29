package ATM;

class domestic extends atm {
    domestic(double balance, int pin) {
        super(balance, pin);
    }
    
    @Override
    public void withdrawAmount(int pin, double amount) {
        System.out.println("Domestic ATM");
        super.withdrawAmount(pin, amount);
    }
}