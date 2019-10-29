package tsi.notepad;

import java.time.LocalDate;

public class Reminder extends Alarm {

    @Override
    public void askInfo() {
        String strDate = Asker.askString("Set date (Format: YYYY.MM.DD) > ");
        date = LocalDate.parse(strDate, Asker.DATE_FORMAT);
        super.askInfo();
    }

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}

    private LocalDate date;

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(Asker.DATE_FORMAT).contains(str);
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