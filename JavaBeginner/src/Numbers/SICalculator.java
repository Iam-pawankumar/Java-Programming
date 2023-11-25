package Numbers;

import java.math.BigDecimal;

public class SICalculator {
    private BigDecimal principle;
    private BigDecimal interest;

    public SICalculator(String p, String i){
        this.principle = new BigDecimal(p);
        this.interest = new BigDecimal(i).divide(new BigDecimal(100));
    }

    public BigDecimal calculateToValue(int t){
        BigDecimal years = new BigDecimal(t);
        BigDecimal total = this.principle.add((this.principle.multiply(this.interest)).multiply(years));
        return total;
    }
}
