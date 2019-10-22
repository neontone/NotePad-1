package tsi.notepad;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.print("time> ");
        time = Main.scan.next();
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.contains(str);
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
