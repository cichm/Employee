package Employee;

import EmployeeCard.EmployeeCard;
import Payment.CommissionedClassification;
import Payment.IPayClassification;
import Payment.SalesReceipt;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Employee {
    private final Name name;
    private final Surname surname;
    private final EmployeeId id;
    private final WorkType type;
    private final BigDecimal reward;
    private final LinkedList<EmployeeCard> employeeCard;
    private final Dues dues;
    private IPayClassification payClassification;

    public static class Builder {
        private Name name;
        private Surname surname;
        private EmployeeId id;
        private LinkedList<EmployeeCard> employeeCard;

        SalesReceipt salesReceipt = new SalesReceipt(LocalDateTime.of(2018, 9, 8, 8, 30), 5);
        private WorkType type = WorkType.standard;
        private BigDecimal reward = new BigDecimal(5000);
        private Dues dues = Dues.dues(60);
        private IPayClassification payClassification = new CommissionedClassification(5000, 1, salesReceipt);

        public Builder(Name name, Surname surname, EmployeeId id, LinkedList<EmployeeCard> employeeCard) {
            this.name = name;
            this.surname = surname;
            this.id = id;
            this.employeeCard = employeeCard;
        }

        public Builder workType(WorkType workType) {
            workType = workType;
            return this;
        }

        public Builder reward(BigDecimal reward) {
            reward = reward;
            return this;
        }

        public Builder dues(Dues dues) {
            dues = dues;
            return this;
        }

        public Builder payClassification(IPayClassification payClassification) {
            payClassification = payClassification;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    private Employee(Builder builder) {
        name = builder.name;
        surname = builder.surname;
        id = builder.id;
        type = builder.type;
        reward = builder.reward;
        employeeCard = builder.employeeCard;
        dues = builder.dues;
        payClassification = builder.payClassification;
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
