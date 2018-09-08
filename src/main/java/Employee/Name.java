package Employee;

public class Name {
    private final String name;

    private Name() {
        name = "";
    }

    private Name(String name) {
        this.name = name;
    }

    public static Name name(String name) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Proszę wprowadzić prawidłowe imie.");
        }
        return new Name(name);
    }
}
