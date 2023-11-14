package handler;

import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class ConsoleHandler {

    public static String getNameCar() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name car:");
            String name = sc.nextLine();
            return name;
        } catch (Exception e) {
            System.out.println("mistake in method consoleHandler " + e);
        }
        return null;
    }
}
