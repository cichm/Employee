import AccountType.FullTime;
import Employee.Employee;
import EmployeeCard.EmployeeCard;
import Payment.CommissionedClassification;
import Payment.SalesReceipt;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

import static Employee.Dues.dues;
import static Employee.Name.name;
import static Employee.Surname.surname;
import static Employee.EmployeeId.employeeId;
import static Employee.Address.address;

import static EmployeeCard.StartDate.startDate;
import static EmployeeCard.EndDate.endDate;

public class Main {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(2018, 9, 8, 8, 30);
        LocalDateTime endDate = LocalDateTime.of(2018, 9, 8, 16, 30);
        EmployeeCard employeeCard = new EmployeeCard(startDate(startDate), endDate(endDate));

        LinkedList<EmployeeCard> employeeCardCollection = new LinkedList<EmployeeCard>();
        employeeCardCollection.add(employeeCard);

        SalesReceipt salesReceipt = new SalesReceipt(LocalDateTime.of(2018, 9, 8, 8, 30), 5);

        HashMap<String, Employee> employees = new HashMap<>();
        employees.put("11112", new Employee.Builder(surname("Płaszkowski"), address("Warsaw Krakowska 3/1"), employeeId(04440), employeeCardCollection, new FullTime(new BigDecimal(5000))).build());
        employees.put("11113", new Employee.Builder(surname("Michalewicz"), address("Cracow Katowicka 3/4"), employeeId(04440), employeeCardCollection, new FullTime(new BigDecimal(5000))).
                name(name("Janusz")).dues(dues(60)).reward(new BigDecimal(5000)).
                payClassification(new CommissionedClassification(5000, 1, salesReceipt)).build());

        System.out.print(employees.get("11112").toString());
    }
}