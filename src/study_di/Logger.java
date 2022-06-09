package study_di;

public class Logger implements ILogger{
    @Override
    public void LogInfo(String info) {
        System.out.println(info);
    }
}
