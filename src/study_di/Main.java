package study_di;

public class Main {
    public static void main(String[] args) {
        DIContainer diContainer = new DIContainer();
        diContainer.setSql(new SqlDatabase());
        diContainer.setLogger(new Logger());
        diContainer.setEmailSender(new EmailSender());

        diContainer.getSql().save();
        diContainer.getEmailSender().sendEmail(12345464);
        diContainer.getLogger().LogInfo("sent");
    }
}
