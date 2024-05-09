package Part3.Task_3;

public class Task {
    public void processOrder(int quantity, double price) {
        if (quantity > 10) {
            // Дубльований фрагмент
            applyDiscount();
            // Операція 1
        } else {
            // Операція 1
        }
        if (price > 100) {
            // Дубльований фрагмент
            applyDiscount();
            // Операція 2
        } else {
            // Операція 2
        }
    }

    private void applyDiscount() {
    }
}
