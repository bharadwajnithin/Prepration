package ATM;





class atm {
	protected double balance; // private variable 
	protected int pin;
	String name;

	// constructer 
	public atm(double initbalance, int initpin) {
		this.balance = initbalance;
		this.pin = initpin;
	}

	public double getBalance(int enteredPin) {
		if (this.pin == enteredPin) {
			return balance;
		} else {
			System.out.println("INcrroct pin acess denied !!!");
			return -1;
		}
	} 

	public void withdrawAmount(int enterdpin, double amount) {
		if (pin == enterdpin) {
			if (amount <= balance) {
				balance -= amount;
				System.out.println("withdrawn amount " + amount + "sucessufully");
				System.out.println("remaining balance " + balance);
			} else {
				System.out.println("INsufficient balance");
			}
		} else {
			System.out.println("Incrroct pin !! Acess denied ");
		}
	}

	// polymorphism overloding
	public void withdrawAmount(int enterdpin, double amount, String reson) {
		System.out.println("transation for " + reson);
		withdrawAmount(enterdpin, amount);
	}

	public void deposit(int enteredpin, double amount) {
		if (this.pin == enteredpin) {
			balance += amount;
			System.out.println("the amount" + amount + "sucessfully");
			System.out.println("The current balance is " + balance);
		}
	}
}

class domestic extends  atm{
	domestic(double balance,int pin)
	{
		super(balance,pin);
	}
	
	@Override
	public void withdrawAmount(int pin,double amount ) {
		System.out.println("domestic atm");
		super.withdrawAmount(pin, amount);

	}
	
}


class international extends atm{
	international(double balance,int pin){
		super(balance,pin);
	}
	
	@Override
	public void withdrawAmount(int pin,double amount) {
		System.out.println("international ATM  ");
		
		double fee=2;
		
		if (this.pin==pin) {
			balance-=amount+fee;
			System.out.println("withdrawn amount "+amount +"sucessfully");
			System.out.println("the blance is "+balance );
			
			
			
		}
		else {
			System.out.println("Incorrect pin ");
		}
		
		
		
		
	}
}





public class Bank {

	public static void main(String[] args) {
		
		
		//atm myatm=new atm(5000,200);
		
		//System.out.println("your balance "+myatm.getBalance(200));
		
		
		// try to correct  pin 
		//myatm.withdrawAmount(200, 4000);
		
		
		
		// try to incorrect pin 
		//myatm.withdrawAmount(200, 2000,"game");
		//myatm.deposit(200, 200000);
		
		
				
		atm domestic = new domestic (5000, 200);
        atm international = new international(5000, 200);

        //domestic.deposit(200, 1000);
        //domestic.withdrawAmount(200, 500);

        System.out.println("----- International ATM -----");

        //international.deposit(200, 1000);
        international.withdrawAmount(200, 500);
		
		
		
		

	}

}
