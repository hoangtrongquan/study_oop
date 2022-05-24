package state;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Log {
    String code;
    List<Bill> bills;
    LocalDateTime time;

    public Log(String code, List<Bill> bills, LocalDateTime time) {
        this.code = code;
        this.bills = bills;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Log{" +
                "code='" + code + '\'' +
                ", bills=" + bills +
                ", time=" + time +
                '}';
    }
}
