package EmployeeCard;

public class EmployeeCard {
    private StartDate startData;
    private EndDate endData;

    public EmployeeCard(StartDate startData, EndDate endData) {
        this.startData = startData;
        this.endData = endData;
    }

    public StartDate getStartData() {
        return startData;
    }

    public EndDate getEndData() {
        return endData;
    }
}
