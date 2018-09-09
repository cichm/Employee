package EmployeeCard;

import java.time.LocalDateTime;

public class EndDate {
    private final LocalDateTime endDate;

    private EndDate() {
        this.endDate = LocalDateTime.now();
    }

    private EndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public static EndDate endDate(LocalDateTime endDate) {
        if (endDate.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Podana data zakonczenia jest bledna.");
        }

        return new EndDate(endDate);
    }
}
