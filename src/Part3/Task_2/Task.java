package Part3.Task_2;

public class Task {
    public void processPayment(double amount, boolean isMember, boolean
            isDiscountAvailable) {
        if (amount > 100 && isMember) {
            applyDiscount();
        }
        if (amount > 200 && isDiscountAvailable) {
            applyDiscount();
        }
    }

    private void applyDiscount() {
    }
}
