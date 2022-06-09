package study_di;

public class DIContainer {
    private IDatabase sql;
    private ILogger logger;
    private IEmailSender emailSender;

    public IDatabase getSql() {
        return sql;
    }

    public void setSql(IDatabase sql) {
        this.sql = sql;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public IEmailSender getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(IEmailSender emailSender) {
        this.emailSender = emailSender;
    }
}
