package Employee;

import Payment.IPayClassification;
import Payment.SalariedClassigication;

public class PayClassification {
    private final IPayClassification iPayClassification;

    private PayClassification() {
        this.iPayClassification = new SalariedClassigication(0);
    }

    private PayClassification(IPayClassification iPayClassification) {
        this.iPayClassification = iPayClassification;
    }

    public PayClassification payClassification(IPayClassification iPayClassification) {
        return new PayClassification(iPayClassification);
    }
}
