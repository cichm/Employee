package Payment;

public class SakaruedClassification implements IPayClassification {

    private float monthlyPay;

    public SakaruedClassification(float monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    @Override
    public void calculatePay() {

    }
}
