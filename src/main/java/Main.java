import Employee.Employee;
import Employee.WorkType;
import EmployeeCard.EmployeeCard;
import Payment.CommissionedClassification;
import Payment.SalesReceipt;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

import static Employee.Dues.dues;
import static Employee.Name.name;
import static Employee.Surname.surname;
import static Employee.EmployeeId.employeeId;

import static EmployeeCard.StartDate.startDate;
import static EmployeeCard.EndDate.endDate;

public class Main {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(2018, 9, 8, 8, 30);
        LocalDateTime endDate = LocalDateTime.of(2018, 9, 8, 16, 30);
        EmployeeCard employeeCard = new EmployeeCard(startDate(startDate), endDate(endDate));

        LinkedList<EmployeeCard> employeeCardCollection = new LinkedList<EmployeeCard>();
        employeeCardCollection.add(employeeCard);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        SalesReceipt salesReceipt = new SalesReceipt(LocalDateTime.of(2018, 9, 8, 8, 30), 5);
        employees.add(new Employee.Builder(name("Jarosław"), surname("Michalewski"), employeeId(04440), employeeCardCollection).build());
        employees.add(new Employee.Builder(name("Jarosław"), surname("Michalewski"), employeeId(04440), employeeCardCollection).
                dues(dues(60)).workType(WorkType.standard).reward(new BigDecimal(5000)).
                payClassification(new CommissionedClassification(5000, 1, salesReceipt)).build());

        System.out.print(employees.get(1).toString());
    }
}