package Java.Payments;
import Java.Payment;

class PayPal extends Payment {
    String email;
    public PayPal(Integer id, String email) {
        super(id);
        this.email = email;
    }
}
