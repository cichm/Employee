package Employee;

public class Dues {

    private final int dues;

    private Dues() {
        this.dues = 0;
    }

    private Dues(int dues) {
        this.dues = dues;
    }

    public static Dues dues(int dues) {
        if (dues < 0) {
            throw new IllegalArgumentException("Wartość składek musi być wartością dodatnią.");
        }
        return new Dues(dues);
    }
}
