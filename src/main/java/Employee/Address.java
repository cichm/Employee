package Employee;

public class Address {
    public String address;

    private Address() {
    }

    private Address(String address) {
        this.address = address;
    }

    public static Address address(String address) {
        if ("".equals(address)) {
            throw new IllegalArgumentException("Proszę wprowadzić prawidłowe imie.");
        }
        return new Address(address);
    }
}
