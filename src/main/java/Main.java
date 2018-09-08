import Employee.Employee;
import Employee.WorkType;
import EmployeeCard.EmployeeCard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import static Employee.Dues.dues;
import static Employee.Name.name;
import static Employee.Surname.surname;
import static Employee.EmployeeId.employeeId;

import static EmployeeCard.StartDate.startDate;
import static EmployeeCard.EndDate.endDate;

public class Main {
    public static void main(String[] args) {
        EmployeeCard employeeCard = new EmployeeCard(startDate(new Date()), endDate(new Date()));

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee().setName(name("Jarosław")).setSurname(surname("Michalewski")).setId(employeeId(04440))
                .setWorkType(WorkType.standard).setReward(new BigDecimal(5000)).setEmployeeCard(employeeCard)
                .setDues(dues(60)));

        System.out.print(employees.get(0).toString());
    }
}