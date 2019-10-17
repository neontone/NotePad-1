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
                default:
                    System.out.println("Error: Unknown command");
            }
        }
    }

    private static void showHelp() {
        System.out.println("One day here will be a great manual. Eventually.");
    }
}
