package Payment;

import java.time.LocalDateTime;

public class TimedCard {
    private LocalDateTime localDateTime;
    private int hours;

    public TimedCard(LocalDateTime localDateTime, int hours) {
        this.localDateTime = localDateTime;
        this.hours = hours;
    }
}
