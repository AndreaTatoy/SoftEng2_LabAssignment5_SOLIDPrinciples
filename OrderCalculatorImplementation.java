package LabAssignment5_SOLIDPrinciples;

public class OrderCalculatorImplementation implements OrderCalculator {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}
