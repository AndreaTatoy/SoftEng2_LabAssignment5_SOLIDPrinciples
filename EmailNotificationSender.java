package LabAssignment5_SOLIDPrinciples;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("\nEmail notification sent to: " + email);
    }
}
