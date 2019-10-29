package tsi.notepad;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Expirable{

    @Override
    public void askInfo() {
        date = Asker.askDate("Set date (Format: YYYY.MM.DD) > ");
        super.askInfo();
    }

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}

    private LocalDate date;
    private boolean dismissed = false;

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(Asker.DATE_FORMAT).contains(str);
    }

    @Override
    public boolean isExpired() {
        if (dismissed) {
            return false;
        }
        LocalDateTime dt = LocalDateTime.of(date, getTime());
                        return LocalDateTime.now().isAfter(dt);
    }

    @Override
    public void dismiss() {
           dismissed = true;
    }

    @Override
    public String toString() {
        return "Reminder's " +
                "id=" + getId() +
                " | Message: " + getText() +
                ". Appears on " + getTime() +
                " of " + date.format(Asker.DATE_FORMAT);
    }
}