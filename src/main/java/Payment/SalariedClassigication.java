package Payment;

public class SalariedClassigication implements IPayClassification {
    private float monthlyPay;

    public SalariedClassigication(float monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    @Override
    public void calculatePay() {
        this.toString();
    }

    @Override
    public String toString() {
        return "SalariedClassigication{" +
                "monthlyPay=" + monthlyPay +
                '}';
    }
}
