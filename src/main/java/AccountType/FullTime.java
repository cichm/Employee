package AccountType;

import java.math.BigDecimal;

public class FullTime implements AccountType {
    private BigDecimal rate;

    public FullTime(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
