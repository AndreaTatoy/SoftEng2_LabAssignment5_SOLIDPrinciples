package LabAssignment5_SOLIDPrinciples;

public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator calculator = new OrderCalculatorImplementation();
        OrderPlacer placer = new OrderPlacerImplementation();
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImplementation();
        NotificationSender notificationSender = new EmailNotificationSender();

        // Calculate total
        double total = calculator.calculateTotal(125.0, 2);
        System.out.println("\nOrder total: PHP" + total);

        // Place order
        placer.placeOrder("Juan Dela Cruz", "123 Building B, Masayahin St., Brgy. FM, Caloocan City");

        // Generate invoice
        invoiceGenerator.generateInvoice("order_123.pdf");

        // Send email notification
        notificationSender.sendEmailNotification("juandelacruz@gmail.com");
    }
}
