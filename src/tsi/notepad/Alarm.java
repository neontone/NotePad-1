package tsi.notepad;

public class Alarm extends Note {
    private String time;

    public void askAlarmInfo() {
        askNoteInfo();
        System.out.print("time> ");
        time = Main.scan.next();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
