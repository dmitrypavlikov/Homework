package console;

import java.util.Scanner;

public class consoleHelper {

    public String readMessage() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

    public void writeMessage(String message) {
        System.out.println(message);
    }

    private consoleHelper() {}

    private static final consoleHelper instance = new consoleHelper();
    public static consoleHelper getInstance() {
        return instance;
    }
}
