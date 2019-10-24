package tsi.notepad;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Alarm extends Note {
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");
    private LocalTime time;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.print("Set time (Format HH:MM)> ");
        String strTime = Main.scan.next();
        time = LocalTime.parse(strTime, TIME_FORMAT);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.format(TIME_FORMAT).contains(str);
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time.format(TIME_FORMAT) + '\'' +
                '}';
    }
}
