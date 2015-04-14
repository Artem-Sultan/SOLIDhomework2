package transactions;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by artem on 14.04.15.
 */
public class TransactionHeader {
    private final String id;
    private final LocalDate date;
    private final LocalTime time;

    public TransactionHeader(String id, LocalDate date, LocalTime time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
