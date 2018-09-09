package Employee;

import EmployeeCard.EmployeeCard;
import Payment.IPayClassification;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Employee {
    private Name name;
    private Surname surname;
    private EmployeeId id;
    private WorkType type;
    private BigDecimal reward;
    private LinkedList<EmployeeCard> employeeCard;
    private Dues dues;
    private IPayClassification payClassification;

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

    public Employee setEmployeeCard(LinkedList<EmployeeCard> employeeCard) {
        this.employeeCard = new LinkedList<EmployeeCard>(employeeCard);

        return this;
    }

    public Employee setDues(Dues dues) {
        this.dues = dues;

        return this;
    }

    public Employee setPayClassification(IPayClassification payClassification) {
        this.payClassification = payClassification;

        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", surname=" + surname +
                ", id=" + id +
                ", type=" + type +
                ", reward=" + reward +
                ", employeeCard=" + employeeCard +
                ", dues=" + dues +
                ", payClassification=" + payClassification +
                '}';
    }
}
