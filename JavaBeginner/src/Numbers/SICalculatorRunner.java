package Numbers;

import java.math.BigDecimal;

public class SICalculatorRunner {
    public static void main(String args[]){
        SICalculator siCalculator = new SICalculator("4500.00", "7.5");
        BigDecimal totalVal = siCalculator.calculateToValue(5);
        System.out.println(totalVal);
    }
}
