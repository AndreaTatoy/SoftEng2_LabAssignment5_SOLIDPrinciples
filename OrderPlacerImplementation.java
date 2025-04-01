package LabAssignment5_SOLIDPrinciples;

public class OrderPlacerImplementation implements OrderPlacer {
    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("\nOrder placed for " + customerName + " at " + address);
    }
}
