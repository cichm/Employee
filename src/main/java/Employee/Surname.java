package Employee;

public class Surname {
    private final String surname;

    private Surname() {
        this.surname = "";
    }

    private Surname(String surname) {
        this.surname = surname;
    }

    public static Surname surname(String surname) {
        if ("".equals(surname)) {
            throw new IllegalArgumentException("Proszę wprowadzić prawidłowe nazwisko.");
        }

        return new Surname(surname);
    }
}
