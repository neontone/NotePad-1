package tsi.notepad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reminder extends Alarm {
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("uuuu.MM.dd");

    @Override
    public void askInfo() {
        System.out.print("Set date (Format: YYYY.MM.DD) > ");
        String strDate = Main.scan.next();
        date = LocalDate.parse(strDate, DATE_FORMAT);
        super.askInfo();
    }

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}

    private LocalDate date;



    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(DATE_FORMAT).contains(str);
    }

    @Override
    public String toString() {
        return "Reminder's " +
                "id=" + getId() +
                " | Message: " + getText() +
                ". Appears on " + getTime() +
                " of " + date.format(DATE_FORMAT);
    }
}