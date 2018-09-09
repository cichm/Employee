package EmployeeCard;

import java.time.LocalDateTime;

public class StartDate {
    private final LocalDateTime startDate;

    public StartDate() {
        this.startDate = LocalDateTime.now();
    }

    private StartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public static StartDate startDate(LocalDateTime startDate) {
        if (startDate.isAfter(LocalDateTime.now())) {
            new IllegalArgumentException("Podana data rozpoczecia jest błędna.");
        }
        return new StartDate(startDate);
    }
}
