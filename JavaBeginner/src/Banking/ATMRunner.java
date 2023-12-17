package Banking;
import Banking.ATM.AutomaticTellerMachine;

public class ATMRunner {

    public static void main(String args[]){

        AutomaticTellerMachine atm = new AutomaticTellerMachine(1000.00f);

        System.out.printf("Your account Balance is: %f", atm.getAccBal()).println();
        System.out.printf("Your old balance is: %f \nDeposited %f \nTotal balance is: %f", atm.getAccBal(), 12000.00f,atm.deposit(12000.00f)).println();
        System.out.printf("Transferred %f Successfully \nRemaining balance is: %f", 5000.00f, atm.transfer(5000.00f)).println();
    }


}
