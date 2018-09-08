package Employee;

import EmployeeCard.EmployeeCard;

import java.math.BigDecimal;

public class Employee {
    private Name name;
    private Surname surname;
    private EmployeeId id;
    private WorkType type;
    private BigDecimal reward;
    private EmployeeCard employeeCard;
    private Dues dues;

    public Employee setName(Name name) {
        this.name = name;

        return this;
    }

    public Employee setSurname(Surname surname) {
        this.surname = surname;

        return this;
    }

    public Employee setId(EmployeeId id) {
        this.id = id;

        return this;
    }

    public Employee setWorkType(WorkType type) {
        this.type = type;

        return this;
    }

    public Employee setReward(BigDecimal reward) {
        this.reward = reward;

        return this;
    }

    public Employee setEmployeeCard(EmployeeCard employeeCard) {
        this.employeeCard = employeeCard;

        return this;
    }

    public Employee setDues(Dues dues) {
        this.dues = dues;

        return this;
    }
}
