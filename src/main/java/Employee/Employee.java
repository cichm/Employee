package Employee;

import AccountType.AccountType;
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
    private final Address address;
    private final EmployeeId id;
    private final BigDecimal reward;
    private final LinkedList<EmployeeCard> employeeCard;
    private final Dues dues;
    private IPayClassification payClassification;
    private AccountType accountType;

    public static class Builder {
        private Surname surname;
        private Address address;
        private EmployeeId id;
        private LinkedList<EmployeeCard> employeeCard;
        private AccountType accountType;

        private Name name = Name.name("EmptyAnonim");
        private SalesReceipt salesReceipt = new SalesReceipt(LocalDateTime.of(2018, 9, 8, 8, 30), 5);
        private BigDecimal reward = new BigDecimal(5000);
        private Dues dues = Dues.dues(60);
        private IPayClassification payClassification = new CommissionedClassification(5000, 1, salesReceipt);

        public Builder(Surname surname, Address address, EmployeeId id, LinkedList<EmployeeCard> employeeCard, AccountType accountType) {
            this.surname = surname;
            this.address = address;
            this.id = id;
            this.employeeCard = employeeCard;
            this.accountType = accountType;
        }

        public Builder name(Name name) {
            name = name;
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
        address = builder.address;
        id = builder.id;
        reward = builder.reward;
        employeeCard = builder.employeeCard;
        dues = builder.dues;
        payClassification = builder.payClassification;
        accountType = builder.accountType;
    }

    public Name getName() {
        return name;
    }

    public Surname getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }

    public EmployeeId getId() {
        return id;
    }

    public BigDecimal getReward() {
        return reward;
    }

    public LinkedList<EmployeeCard> getEmployeeCard() {
        return employeeCard;
    }

    public Dues getDues() {
        return dues;
    }

    public IPayClassification getPayClassification() {
        return payClassification;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", surname=" + surname +
                ", address=" + address +
                ", id=" + id +
                ", reward=" + reward +
                ", employeeCard=" + employeeCard +
                ", dues=" + dues +
                ", payClassification=" + payClassification +
                ", accountType=" + accountType +
                '}';
    }
}
