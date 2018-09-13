import AccountType.FullTime
import Employee.Employee
import Employee.Surname
import EmployeeCard.EmployeeCard
import EmployeeCard.EndDate
import EmployeeCard.StartDate
import spock.lang.Specification

import java.time.LocalDateTime

import static Employee.Address.address
import static Employee.EmployeeId.employeeId
import static Employee.Surname.surname

class EmployeeTest extends Specification {
    def "Initialize Employee with hour hourly rate"() {
        given: "Prepare data"
        def startDate = LocalDateTime.of(2018, 9, 8, 8, 30);
        def endDate = LocalDateTime.of(2018, 9, 8, 16, 30);
        EmployeeCard employeeCard = new EmployeeCard(StartDate.startDate(startDate), EndDate.endDate(endDate));
        LinkedList<EmployeeCard> employeeCardCollection = new LinkedList<EmployeeCard>();
        employeeCardCollection.add(employeeCard);

        when: "Work type is FullTime"
        HashMap<String, Employee> employees = new HashMap<>();
        employees.put("11112", new Employee.Builder(surname("Płaszkowski"), address("Warsaw Krakowska 3/1"),
                employeeId(04440), employeeCardCollection, new FullTime(new BigDecimal(5000))).build());

        then: "Get right result"
        def rate = new BigDecimal(5000)
        rate == employees.get("11112").getAccountType().getRate()
    }
}