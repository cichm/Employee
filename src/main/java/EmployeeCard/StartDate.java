package EmployeeCard;

import java.util.Date;

public class StartDate {
    private final Date startDate;

    public StartDate() {
        this.startDate = new Date();
    }

    private StartDate(Date startDate) {
        this.startDate = startDate;
    }

    public static StartDate startDate(Date startDate) {
        if (startDate.after(new Date())) {
            new IllegalArgumentException("Podana data rozpoczecia jest błędna.");
        }
        return new StartDate(startDate);
    }
}
