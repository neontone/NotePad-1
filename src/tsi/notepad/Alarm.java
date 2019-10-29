package tsi.notepad;

import java.time.LocalTime;

public class Alarm extends Note {
    private LocalTime time;

    @Override
    public void askInfo() {
        super.askInfo();
        time = Asker.askTime("time>");
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.format(Asker.TIME_FORMAT).contains(str);
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
                ", time='" + time.format(Asker.TIME_FORMAT) + '\'' +
                '}';
    }
}
