package Employee;

public class EmployeeId {
    private final int id;

    private EmployeeId() {
        this.id = 0;
    }

    private EmployeeId(int id) {
        this.id = id;
    }

    public static EmployeeId employeeId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Podano nieprawidłowe id");
        }

        return new EmployeeId(id);
    }
}
