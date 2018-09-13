package AccountType;

import java.math.BigDecimal;

public class HourRate implements AccountType {
    private BigDecimal rate;

    public HourRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
