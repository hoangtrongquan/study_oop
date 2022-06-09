package study_di;

public class EmailSender implements IEmailSender{
    @Override
    public void sendEmail(int userId) {
        System.out.println("send mail for user id: " + userId);
    }
}
