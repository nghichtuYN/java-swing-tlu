package Models;

public class PaymentStatus {
    private int id;
    private String payment_status_name;

    public PaymentStatus(int id, String payment_status_name) {
        this.id = id;
        this.payment_status_name = payment_status_name;
    }

    public PaymentStatus() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayment_status_name() {
        return payment_status_name;
    }

    public void setPayment_status_name(String payment_status_name) {
        this.payment_status_name = payment_status_name;
    }
}
