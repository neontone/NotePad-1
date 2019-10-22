package tsi.notepad;

public class Note extends Record {
    private String text;

    public void askNoteInfo() {
        System.out.print("text> ");
        text = Main.scan.next();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + text + '\'' +
                '}';
    }
}
