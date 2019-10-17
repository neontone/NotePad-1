package tsi.notepad;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

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
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void createRecord() {
        System.out.print("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            default:
                System.out.println("Error: Unknown record type");
        }
    }

    private static void createPerson() {
        System.out.print("Name> ");
        String name = scan.next();
        System.out.print("Surname> ");
        String surname = scan.next();
        System.out.println("Phone> ");
        String phone = scan.next();

        Person p = new Person();
        p.setName(name);
        p.setSurname(surname);
        p.setPhone(phone);


    }

    private static void showHelp() {
        System.out.println("One day here will be a great manual. Eventually.");
    }
}
