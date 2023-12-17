package Banking.ATM;

public class AutomaticTellerMachine {

    private float accBal;
    public AutomaticTellerMachine(float basicAmount){
        this.accBal += basicAmount;
    }
    public float getAccBal() {
        return this.accBal;
    }

    public float deposit(float amount){
        this.accBal = this.accBal + amount;
        return getAccBal();
    }

    public float withdraw(float amount){
        this.accBal = this.accBal - amount;
        return getAccBal();
    }

    public float transfer(float amount){
        return withdraw(amount);
    }
}
