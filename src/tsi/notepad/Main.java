package tsi.notepad;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import static tsi.notepad.Asker.scan;

public class Main {
    static ArrayList<Record> records = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter a command. Type 'help' for help.");
        for (; ; ) {
            String cmd = Asker.askString("cmd");
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
                case "find":
                    findRecords();
                    break;
                case "delete":
                    deleteRecord();
                    break;
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void findRecords() {
        String str = Asker.askString("substring>");
        for (Record r : records) {
            if (r.contains(str)) {
                System.out.println(r);
            }
        }
    }

    private static void deleteRecord() {
        int id = Asker.askInt("id");
        for (int i = 0; i < records.size(); i++) {
            Record r = records.get(i);
            if (id == r.getId()) {
                records.remove(i);
                break;
            }
        }
    }



    private static void listRecords() {
        for (Record r : records) {
            System.out.println(r);
        }
    }

    private static void createRecord() {
        String type = Asker.askString("type> ");
        switch (type) {
            case "person":
                createRecord(new Person());
                break;
            case "note":
                createRecord(new Note());
                break;
            case "alarm":
                createRecord(new Alarm());
                break;
            case "reminder":
                createRecord(new Reminder());
                break;
            default:
                System.out.println("Error: Unknown record type");
        }
    }

    private static void createRecord(Record r) {
        r.askInfo();
        records.add(r);
    }

    private static void showHelp() {
        System.out.println("One day here will be a great manual. Eventually.");
    }
}
