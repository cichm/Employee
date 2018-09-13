import spock.lang.*;
import EmployeeCard.StartDate

import java.time.LocalDateTime;

class EmployeeCardTest extends Specification {
    def "should be done if start date will be is not equal to or greater than the present date"() {
        given: "Initialize StartDate object and put LocalDateTime"
        def date = LocalDateTime.of(2018, 9, 8, 8, 30)
        def startDate = StartDate.startDate(date)

        when:"Get LocalDateTime from object"
        def remoteDate = startDate.getStartDate()

        then:"Should compares dates "
        remoteDate == date
    }
}