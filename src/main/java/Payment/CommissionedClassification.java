package Payment;

public class CommissionedClassification implements IPayClassification {

    private float basePay;
    private float commissionRate;
    private SalesReceipt salesReceipt;

    public CommissionedClassification(float basePay, float commissionRate, SalesReceipt salesReceipt) {
        this.basePay = basePay;
        this.commissionRate = commissionRate;
        this.salesReceipt = salesReceipt;
    }

    @Override
    public void calculatePay() {
        this.toString();
    }

    @Override
    public String toString() {
        return "CommissionedClassification{" +
                "basePay=" + basePay +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
