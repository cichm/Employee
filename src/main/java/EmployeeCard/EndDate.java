package EmployeeCard;

import java.util.Date;

public class EndDate {
    private final Date endDate;

    private EndDate() {
        this.endDate = new Date();
    }

    private EndDate(Date endDate) {
        this.endDate = endDate;
    }

    public static EndDate endDate(Date endDate) {
        if (endDate.after(new Date())) {
            throw new IllegalArgumentException("Podana data zakonczenia jest bledna.");
        }

        return new EndDate(endDate);
    }
}
