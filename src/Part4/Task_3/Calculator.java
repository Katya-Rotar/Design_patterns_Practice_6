package Part4.Task_3;

public class Calculator {
    public double calculateTotal(double price, int quantity, double discount) {
        return price * quantity * (1 - discount);
    }
}
