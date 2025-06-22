
public class TestDecoratorPattern {
    public static void main(String[] args) {
        
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier allNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        System.out.println("=== Sending via Email only ===");
        emailNotifier.send("Hello, user!");

        System.out.println("\n=== Sending via Email + SMS ===");
        smsAndEmailNotifier.send("Meeting at 10 AM");

        System.out.println("\n=== Sending via Email + SMS + Slack ===");
        allNotifier.send("Server down!");
    }
}

