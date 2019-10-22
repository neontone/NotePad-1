package tsi.notepad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter a command. Type 'help' for help.");
        for (; ; ) {
            System.out.print("> ");
            String cmd = scan.next();
            switch (cmd) {
                case "exit":
                    System.out.println("Good bye!");
                    return;
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void listRecords() {
        for (Record p : records) {
            System.out.println(p);
        }
    }

    private static void createRecord() {
        System.out.print("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            case "note":
                createNote();
                break;
            case "alarm":
                createAlarm();
                break;
            default:
                System.out.println("Error: Unknown record type");
        }
    }

    private static void createAlarm() {
        Alarm a = new Alarm();
        a.askAlarmInfo();
        records.add(a);
    }

    private static void createPerson() {
        Person p = new Person();
        p.askPersonInfo();
        records.add(p);
    }

    private static void createNote() {
        Note p = new Note();
        p.askNoteInfo();
        records.add(p);
    }

    private static void showHelp() {
        System.out.println("One day here will be a great manual. Eventually.");
    }
}
