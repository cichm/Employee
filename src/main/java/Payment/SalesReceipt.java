package Payment;

import java.time.LocalDateTime;

public class SalesReceipt {
    private LocalDateTime date;
    private float amount;

    public SalesReceipt(LocalDateTime date, float amount) {
        this.date = date;
        this.amount = amount;
    }
}
