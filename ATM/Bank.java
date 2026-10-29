package ATM;






public class Bank {
    public static void main(String[] args) {
        // atm myatm = new atm(5000, 200);
        // System.out.println("Your balance " + myatm.getBalance(200));
        
        // try to correct pin 
        // myatm.withdrawAmount(200, 4000);
        
        // try to incorrect pin 
        // myatm.withdrawAmount(200, 2000, "game");
        // myatm.deposit(200, 200000);
                
        atm domestic = new domestic(5000, 200);
        atm international = new international(5000, 200);

        // domestic.deposit(200, 1000);
        // domestic.withdrawAmount(200, 500);

        System.out.println("----- International ATM -----");

        // international.deposit(200, 1000);
        international.withdrawAmount(200, 500);
        
        
    }
}