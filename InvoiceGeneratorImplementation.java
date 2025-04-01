package LabAssignment5_SOLIDPrinciples;

public class InvoiceGeneratorImplementation implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("\nInvoice generated: " + fileName);
    }
}
