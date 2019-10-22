package tsi.notepad;

public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    public abstract void askInfo();

    public int getId() {
        return id;
    }
}
