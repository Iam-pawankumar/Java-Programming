package Numbers;

public class BiNumbers {

    private int num1;

    private int num2;

    public BiNumbers(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int add(){
        return this.num1 + this.num2;
    }

    public int multiply(){
        return this.num1 * this.num2;
    }

    public void doubleNum(){
        this.num1 *= 2;
        this.num2 *= 2;
    }


}
